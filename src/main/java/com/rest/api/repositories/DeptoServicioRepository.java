package com.rest.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.DeptoServicio;

@Repository
public interface DeptoServicioRepository extends JpaRepository<DeptoServicio, Integer> {

    public DeptoServicio findByIdDepartamentos(int id);

    public DeptoServicio findByIdServicios(int id);

    @Query(value = "SELECT * FROM DEPTO_SERVICIO WHERE ID_DEPARTAMENTOS = ?1", nativeQuery = true)
    List<DeptoServicio> getDeptoServicioByIdDepto(int idDepartamentos);

    @Query(value = "SELECT * FROM DEPTO_SERVICIO WHERE ID_SERVICIOS = ?1", nativeQuery = true)
    List<DeptoServicio> getDeptoServicioByIdServicios(int idServicios);
}
