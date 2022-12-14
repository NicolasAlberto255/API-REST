package com.rest.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.api.response.ResponseMessage;
import com.rest.api.response.ResponseReportePdf;
import com.rest.api.services.ReportesPdfService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("reportesPdf/")
public class ReportesPdfController {
    
    @Autowired 
    ReportesPdfService reportesService;
    
    @Autowired
    DeptoValoresController deptoValoresController;

    @GetMapping("reportesList")
    public ResponseEntity<List<ResponseReportePdf>> getReportesList(){
        List<ResponseReportePdf> reportes = reportesService.getAllFiles().map(reporteFile -> {
            String reporteDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/reportesPdf/downloadReporte/")
                .path(reporteFile.getNombreReporte())
                .toUriString();

            return new ResponseReportePdf(
                reporteFile.getIdReporte(),
                reporteFile.getNombreReporte(),
                reporteDownloadUri,
                reporteFile.getTipo(),
                reporteFile.getData().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(reportes);
    }

    @GetMapping("downloadReporte/{nombreReporte}")
    public ResponseEntity<?> downloadReporte(@PathVariable String nombreReporte) {
        byte[] reporteData = reportesService.downloadReporte(nombreReporte);
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_PDF)
            .body(reporteData);
    }

    @GetMapping("crearJson")
    public Object crearJson() {
        Map<Object,Object> reporte = new HashMap<>();

        reporte.put("GananciasDepto", deptoValoresController.getSumaGananciaByIdDepto());
        reporte.put("GananciasZonas", deptoValoresController.getSumaByNombreZonas());

        return reporte;
    }
    

    @PostMapping("reporteUpload")
    public ResponseEntity<ResponseMessage> uploadReporte(@RequestParam("reporte") MultipartFile[] reportes) {
        String message = "";

        try { 
            List<String> fileNames = new ArrayList<>();

            Arrays.asList(reportes).stream().forEach(reporte -> {
                try {
                    reportesService.uploadReporte(reporte);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fileNames.add(reporte.getOriginalFilename());
            });

            message = "Reporte subido correctamente: " + fileNames;
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "No se pudo subir el reporte: " + reportes[0].getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @DeleteMapping("reporteDelete/{nombreReporte}")
    public ResponseEntity<ResponseMessage> deleteReporte(@PathVariable String nombreReporte) {
        String message = "";

        try {
            reportesService.deleteReporteByNombre(nombreReporte);

            message = "Reporte eliminado correctamente";
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "No se pudo eliminar el reporte: " + nombreReporte + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
}