package com.rest.api.controllers;

import com.rest.api.repositories.ProvinciaRepository;
import com.rest.api.services.RegionComunaProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.*;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("provincia/")
public class ProvinciaController {

    @Autowired
    RegionComunaProvinciaService regionComunaProvinciaService;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @GetMapping("provincias")
    public List<Provincia> getProvincias() {
        return regionComunaProvinciaService.getProvincias();
    }

    @GetMapping("{id}")
    public Provincia findById(@PathVariable("id") int id) {
        return this.provinciaRepository.findById(id);
    }

    @GetMapping("nombreProvincia")
    public List<Provincia> getProvinciaByName(@RequestParam String nombreProvincia) {
        return provinciaRepository.findByNombreProvincia(nombreProvincia);
    }

    @GetMapping("provinciasByRegionId")
    public List<Provincia> getProvinciasByRegionId(@RequestParam Integer id) {
        return regionComunaProvinciaService.getProvinciasByIdRegion(id);
    }

    @GetMapping("provinciasByIds")
    public List<Provincia> getProvinciasByIds(@RequestParam Set<Integer> ids) {
        return regionComunaProvinciaService.getProvinciasByIds(ids);
    }
}
