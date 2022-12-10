package com.rest.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.DeptoGanancias;
import com.rest.api.repositories.DeptoGananciasRepository;

@Service
public class DeptoGananciasService {
    
    @Autowired
    DeptoGananciasRepository deptoGananciasRepository;

    public List<DeptoGanancias> findById() {
        return deptoGananciasRepository.findAll();
    }

    public void saveGanancias(DeptoGanancias deptoGanancias) {
        deptoGananciasRepository.save(deptoGanancias);
    }

    public DeptoGanancias getGananciasByIdDepto(int idDeptoGanancias) {
        return deptoGananciasRepository.findByIdDeptoGanancias(idDeptoGanancias);
    }

    public List<String> getSumaGananciaByIdDepto() {
        return deptoGananciasRepository.getSumaGananciaByIdDepto();
    }
}
