package com.rest.api.services;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Reportes;
import com.rest.api.repositories.ReportesRepository;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ReportesService {
    @Autowired
    ReportesRepository reportesRepository;

    public Reportes uploadReportes(MultipartFile reporte) throws IOException {
        String nombreReporte = StringUtils.cleanPath(reporte.getOriginalFilename());
        Reportes reportes = new Reportes(nombreReporte, reporte.getContentType(), reporte.getBytes());

        return reportesRepository.save(reportes);
    }

    public Reportes getReporteById(int idReporte) {
        return reportesRepository.findById(idReporte).get();
    }

    public Stream<Reportes> getAllFiles() {
        return reportesRepository.findAll().stream();
    }

    public byte[] downloadReporte(String nombreReporte) {
        Optional<Reportes> reporteData = reportesRepository.findByNombreReporte(nombreReporte);
        return reporteData.get().getData();
    }

    public Reportes findByNombreReporte(String nombreReporte) {
        return reportesRepository.findByNombreReporte(nombreReporte).get();
    }

    public void deleteReporteByNombre(String nombreReporte) {
        reportesRepository.deleteReporteByNombreReporte(nombreReporte);
    }
}
