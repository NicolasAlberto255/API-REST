package com.rest.api.controllers;

import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Reportes;
import com.rest.api.services.ReportesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("reportes/")
public class RerpotesController {
    
    @Autowired 
    ReportesService reportesService;

    @GetMapping("listReportes")
    public List<Reportes> getReportes() {
        return reportesService.getReportes();
    }
    @GetMapping("{id}")
    public Reportes findById(@PathVariable("id") int id) {
        return this.reportesService.findById(id);
    }

    @PostMapping("reportesSave")
    public Reportes saveReportes(@RequestBody Reportes reportes) {
        return this.reportesService.saveReportes(reportes);
    }

    @PostMapping("reportesUpdate/{id}")
    public Reportes updateReportes(@RequestBody Reportes reportes) {
        return this.reportesService.saveReportes(reportes);
    }

    @DeleteMapping("reportesDelete/{id}")
    public boolean deleteReportes(@PathVariable("id") int id) {
        return this.reportesService.deleteReportes(id);
    }
}
