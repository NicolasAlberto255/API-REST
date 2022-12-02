package com.rest.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.rest.api.response.ResponseReporte;
import com.rest.api.services.ReportesService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("reportes/")
public class RerpotesController {
    
    @Autowired 
    ReportesService reportesService;

   @GetMapping("reportesList")
   public ResponseEntity<List<ResponseReporte>> getReportesList(){
    List<ResponseReporte> reportes = reportesService.getAllFiles().map(reporteFile -> {
        String reporteDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/reportes/download/")
                .path(reporteFile.getNombreReporte())
                .toUriString();

            return new ResponseReporte(
                reporteFile.getIdReporte(),
                reporteFile.getNombreReporte(),
                reporteDownloadUri,
                reporteFile.getTipo(),
                reporteFile.getData().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(reportes);
    }
}