package com.rest.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Servicios;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

    List<Servicios> findServicioByNombreServicios(String nombreServicios);

    public Servicios findById(int id);

    @Query(value = "SELECT * FROM SERVICIOS WHERE ESTADO_SERVICIOS = ?1", nativeQuery = true)
    List<Servicios> getServicioByEstado(String estadoServicios);
}