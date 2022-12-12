package com.rest.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.DeptoZonas;
import com.rest.api.repositories.DeptoZonasRepository;

@Service
public class DeptoZonasService {
    
    @Autowired
    DeptoZonasRepository deptoZonasRepository;
    
    public void getDeptoZonas() {
        deptoZonasRepository.findAll();
    }

    public void getDeptoZonasById(int id) {
        deptoZonasRepository.getZonaByIdDeptoZonas(id);
    }

    public int getValorZonaById(int id) {
        return deptoZonasRepository.getValorZonaByIdDeptoZonas(id);
    }

    public String getNombreZonaById(int id) {
        return deptoZonasRepository.getNombreZonaByIdDeptoZonas(id);
    }

    public List<String> getSumaByNombreZonas() {
        return deptoZonasRepository.getSumaByNombreZonas();
    }

    public void postZona(DeptoZonas deptoZonas) {
        deptoZonasRepository.save(deptoZonas);
    }

    public void updateZona(DeptoZonas deptoZonas) {
        deptoZonasRepository.updateZona(deptoZonas.getIdDeptoZonas(), deptoZonas.getGananciaZona(), deptoZonas.getNombreZona());
    }
}
