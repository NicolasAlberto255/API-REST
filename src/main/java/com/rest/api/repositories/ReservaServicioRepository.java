package com.rest.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReservaServicio;

@Repository
public interface ReservaServicioRepository extends JpaRepository<ReservaServicio, Integer> {

    public ReservaServicio findByIdReserva(int id);

    public ReservaServicio findByIdServicios(int id);

    @Query(value = "SELECT * FROM RESERVA_SERVICIOS WHERE ID_RESERVA = ?1", nativeQuery = true)
    List<ReservaServicio> getReservaServicioByIdReserva(int idReserva);

    @Query(value = "SELECT * FROM RESERVA_SERVICIOS WHERE ID_SERVICIOS = ?1", nativeQuery = true)
    List<ReservaServicio> getReservaServicioByIdServicios(int idServicios);
}
