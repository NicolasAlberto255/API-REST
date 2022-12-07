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

    @Query(value = "SELECT * FROM SERVICIOS WHERE ESTADO_SERVICIOS = ?1", nativeQuery = true)
    List<Servicios> getServicioByEstado(String estadoServicios);

    @Query(value = "SELECT COUNT(*) FROM SERVICIOS", nativeQuery = true)
    List<String> getCountServicio();
    
    @Query(value = "SELECT TRUNC(AVG(PRECIO_SERVICIOS)) FROM SERVICIOS", nativeQuery = true)
    List<String> getAvgPrecioServicio();

    @Query(value = "SELECT SUM(PRECIO_SERVICIOS) FROM SERVICIOS", nativeQuery = true)
    List<String> getSumPrecioServicio();

    @Query(value = "SELECT NOMBRE_SERVICIOS,PRECIO_SERVICIOS FROM SERVICIOS WHERE PRECIO_SERVICIOS > 0",  nativeQuery = true)
    List<String> getPreciosServicio();

    @Query(value = "SELECT ESTADO_SERVICIOS, COUNT(ESTADO_SERVICIOS) FROM SERVICIOS GROUP BY ESTADO_SERVICIOS", nativeQuery = true)
    List<String> getCountServicioByEstado();
}