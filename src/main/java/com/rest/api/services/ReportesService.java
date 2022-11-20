package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Reportes;
import com.rest.api.repositories.ReportesRepository;
import java.util.List;

@Service
public class ReportesService {
    @Autowired
    ReportesRepository reportesRepository;

    public List<Reportes> getReportes() {
        return (List<Reportes>) reportesRepository.findAll();
    }

    public Reportes saveReportes(Reportes reportes) {
        return reportesRepository.save(reportes);
    }

    public Reportes findById(int id) {
        return reportesRepository.findById(id).get();
    }

    public boolean deleteReportes(int id) {
        try {
            reportesRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
