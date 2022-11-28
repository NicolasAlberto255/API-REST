package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.repositories.DeptoServicioRepository;
import com.rest.api.models.DeptoServicio;
import java.util.List;

@Service
public class DeptoServicioService {
    
    @Autowired
    DeptoServicioRepository deptoServicioRepository;

    public List<DeptoServicio> getDeptoServicios() {
        return deptoServicioRepository.findAll();
    }
    
    public List<DeptoServicio> getDeptoServicioByIdDepto(int id) {
        return deptoServicioRepository.getDeptoServicioByIdDepto(id);
    }

    public List<DeptoServicio> getDeptoServicioByIdServicios(int id) {
        return deptoServicioRepository.getDeptoServicioByIdServicios(id);
    }
}
