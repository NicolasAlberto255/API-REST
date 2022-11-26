package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReservaDepartamento;

@Repository
@Transactional
public interface ReservaDeptoRepository extends JpaRepository<ReservaDepartamento, Integer> {

    public ReservaDepartamento findByIdReserva(int id);

    public ReservaDepartamento findByIdDepartamentos(int id);

    @Query(value = "SELECT * FROM RESERVA_DEPARTAMENTO WHERE ID_RESERVA = ?1", nativeQuery = true)
    ReservaDepartamento getReservaDepartamentoByIdReserva(@Param("idReserva") int idReserva);

    @Query(value = "SELECT * FROM RESERVA_DEPARTAMENTO WHERE ID_DEPARTAMENTO = ?1", nativeQuery = true)
    ReservaDepartamento getReservaDepartamentoByIdDepartamentos(@Param("idDepartamento") int idDepartamento);
}
