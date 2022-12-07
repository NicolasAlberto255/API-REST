package com.rest.api.services;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.models.ReportesPdf;
import com.rest.api.repositories.ReportesPdfRepository;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ReportesPdfService {
    @Autowired
    ReportesPdfRepository reportesRepository;

    public ReportesPdf uploadReporte(MultipartFile reporte) throws IOException {
        String nombreReporte = StringUtils.cleanPath(reporte.getOriginalFilename());
        ReportesPdf reportes = new ReportesPdf(nombreReporte, reporte.getContentType(), reporte.getBytes());

        return reportesRepository.save(reportes);
    }

    public ReportesPdf getReporteById(int idReporte) {
        return reportesRepository.findById(idReporte).get();
    }

    public Stream<ReportesPdf> getAllFiles() {
        return reportesRepository.findAll().stream();
    }

    public byte[] downloadReporte(String nombreReporte) {
        Optional<ReportesPdf> reporteData = reportesRepository.findByNombreReporte(nombreReporte);
        return reporteData.get().getData();
    }

    public ReportesPdf findByNombreReporte(String nombreReporte) {
        return reportesRepository.findByNombreReporte(nombreReporte).get();
    }

    public void deleteReporteByNombre(String nombreReporte) {
        reportesRepository.deleteReporteByNombreReporte(nombreReporte);
    }
}
