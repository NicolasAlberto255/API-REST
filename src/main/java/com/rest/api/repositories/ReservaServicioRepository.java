package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReservaServicio;

@Repository
@Transactional
public interface ReservaServicioRepository extends JpaRepository<ReservaServicio, Integer> {

    public ReservaServicio findByIdReserva(int id);

    public ReservaServicio findByIdServicios(int id);

    @Query(value = "SELECT * FROM RESERVA_SERVICIOS WHERE ID_RESERVA = ?1", nativeQuery = true)
    ReservaServicio getReservaServicioByIdReserva(@Param("idReserva") int idReserva);

    @Query(value = "SELECT * FROM RESERVA_SERVICIOS WHERE ID_SERVICIO = ?1", nativeQuery = true)
    ReservaServicio getReservaServicioByIdServicios(@Param("idServicios") int idServicios);
}
