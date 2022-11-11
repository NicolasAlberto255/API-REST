package com.rest.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.*;
import com.rest.api.repositories.*;

@Service
public class ServiciosService {

    @Autowired
    ServiciosRepository serviciosRepository;

    public List<Servicios> getServicios() {
        return serviciosRepository.findAll();
    }

    public Servicios saveServicios(Servicios servicios) {
        return serviciosRepository.save(servicios);
    }

    public List<Servicios> findServicioByNombreServicios(String nombreServicios) {
        return serviciosRepository.findServicioByNombreServicios(nombreServicios);
    }

    public List<Servicios> getServicioByDisponibilidad(String disponibilidadServicios) {
        return serviciosRepository.getServicioByDisponibilidad(disponibilidadServicios);
    }

    public Servicios findById(Integer id) {
        return serviciosRepository.findById(id).get();
    }
}