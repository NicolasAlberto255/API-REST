package com.rest.api.repositories;

import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Reserva;

@Repository
@Transactional
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    public Reserva findById(int id);

    List<Reserva> findByFechaInicio(Date fechaInicio);

    List<Reserva> findByFechaFin(Date fechaFin);

    List<Reserva> findByFechaCreacion(Date fechaCreacion);

    @Query (value = "SELECT * FROM RESERVA WHERE ESTADO_RESERVA = ?1", nativeQuery = true)
    List<Reserva> getReservasByEstado(String estadoReserva);
}