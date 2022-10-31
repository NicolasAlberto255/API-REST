package com.rest.api.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Servicios;

@Repository
@Transactional
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

    List<Servicios> findServicioByNombreServicios(String nombreServicios);

    public Servicios findById(int id);
}