package com.rest.api.controllers;

import com.rest.api.repositories.RegionRepository;
import com.rest.api.services.RegionComunaProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.*;
import java.util.List;

@RestController
@RequestMapping("region/")
public class RegionController {

    @Autowired
    RegionComunaProvinciaService regionComunaProvinciaService;

    @Autowired
    RegionRepository regionRepository;

    @GetMapping("regiones")
    public List<Region> getRegiones() {
        return regionComunaProvinciaService.getRegiones();
    }

    @GetMapping("{id}")
    public Region findById(@PathVariable("id") int id) {
        return this.regionRepository.findById(id);
    }

    @GetMapping("nombreRegion")
    public List<Region> getRegionByName(@RequestParam String nombreRegion) {
        return regionRepository.findByNombreRegion(nombreRegion);
    }

}
