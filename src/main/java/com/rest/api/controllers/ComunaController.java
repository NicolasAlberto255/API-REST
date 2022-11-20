package com.rest.api.controllers;

import com.rest.api.repositories.ComunaRepository;
import com.rest.api.services.RegionComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.*;
import java.util.List;

@RestController
@RequestMapping("comuna/")
public class ComunaController {

    @Autowired
    RegionComunaService regionComunaProvinciaService;

    @Autowired
    ComunaRepository comunaRepository;

    @GetMapping("comunas")
    public List<Comuna> getComunas() {
        return regionComunaProvinciaService.getComunas();
    }

    @GetMapping("{id}")
    public Comuna findById(@PathVariable("id") int id) {
        return this.comunaRepository.findById(id);
    }

    @GetMapping("nombreComuna")
    public List<Comuna> getComunaByName(@RequestParam String nombreComuna) {
        return comunaRepository.findByNombreComuna(nombreComuna);
    }

    @GetMapping("comunasByRegionId")
    public List<Comuna> getcomunasByRegionId(@RequestParam int id) {
        return regionComunaProvinciaService.getComunasByIdRegion(id);
    }
}
