package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ReservaUsuario;

@Repository
@Transactional
public interface ReservaUsuarioRepository extends JpaRepository<ReservaUsuario, Integer> {

    public ReservaUsuario findByIdReserva(int id);

    public ReservaUsuario findByIdUsuario(int id);

    @Query(value = "SELECT * FROM RESERVA_USUARIO WHERE ID_RESERVA = ?1", nativeQuery = true)
    ReservaUsuario getReservaUsuarioByIdReserva(@Param("idReserva") int idReserva);

    @Query(value = "SELECT * FROM RESERVA_USUARIO WHERE ID_USUARIO = ?1", nativeQuery = true)
    ReservaUsuario getReservaUsuarioByIdUsuario(@Param("idUsuario") int idUsuario);
}
