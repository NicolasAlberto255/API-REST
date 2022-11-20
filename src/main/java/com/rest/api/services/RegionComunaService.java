package com.rest.api.services;

import java.util.List;
import com.rest.api.repositories.ComunaRepository;
import com.rest.api.repositories.RegionRepository;
import com.rest.api.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionComunaService {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    ComunaRepository comunaRepository;

    public RegionComunaService() {
    }

    public List<Region> getRegiones() {
        return regionRepository.findAll();
    }

    public List<Comuna> getComunas() {
        return comunaRepository.findAll();
    }

    public Region getRegionById(int id) {
        return regionRepository.findById(id);
    }

    public Comuna getComunaById(int id) {
        return comunaRepository.findById(id);
    }

    public List<Comuna> getComunasByIdRegion(int id) {
        return comunaRepository.getComunasByIdRegion(id);
    }

    public List<Region> getRegionByName(String nombreRegion) {
        return regionRepository.findByNombreRegion(nombreRegion);
    }

    public List<Comuna> getComunaByName(String nombreComuna) {
        return comunaRepository.findByNombreComuna(nombreComuna);
    }
}
