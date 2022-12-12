package com.rest.api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReservaDepartamento;

@Repository
public interface ReservaDeptoRepository extends JpaRepository<ReservaDepartamento, Integer> {

    public ReservaDepartamento findByIdReserva(int id);

    public ReservaDepartamento findByIdDepartamentos(int id);

    @Query(value = "SELECT * FROM RESERVA_DEPARTAMENTOS WHERE ID_RESERVA = ?1", nativeQuery = true)
    List<ReservaDepartamento> getReservaDeptoByIdReserva(int idReserva);

    @Query(value = "SELECT * FROM RESERVA_DEPARTAMENTOS WHERE ID_DEPARTAMENTOS = ?1", nativeQuery = true)
    List<ReservaDepartamento> getReservaDeptoByIdDepto(int idDepartamento);
}
