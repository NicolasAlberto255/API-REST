package com.rest.api.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Departamentos;

@Repository
@Transactional
public interface DepartamentosRepository extends JpaRepository<Departamentos, Integer> {

    public Departamentos findById(int id);

    @Query(value = "SELECT * FROM DEPARTAMENTOS WHERE ESTADO_DEPARTAMENTO = ?1", nativeQuery = true)
    List<Departamentos> getDepartamentosByEstado(String estadoDepartamento);
}