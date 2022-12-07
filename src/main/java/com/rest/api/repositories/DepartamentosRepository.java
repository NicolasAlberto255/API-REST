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

    @Query(value = "SELECT COUNT(*) FROM DEPARTAMENTOS", nativeQuery = true)
    List<String> getCountDepto();
    
    @Query(value = "SELECT AVG(V_NOCHE) FROM DEPARTAMENTOS", nativeQuery = true)
    List<String> getAvgVNoche();

    @Query(value = "SELECT SUM(V_NOCHE) FROM DEPARTAMENTOS", nativeQuery = true)
    List<String> getSumVNoche();

    @Query(value = "SELECT ESTADO_DEPARTAMENTO, COUNT(*) AS TOTAL_DEPTO_ESTADO FROM DEPARTAMENTOS GROUP BY ESTADO_DEPARTAMENTO",
                nativeQuery = true)
    List<String> getCountDeptoByEstado();
    
    @Query(value = "SELECT NOMBRE_COMUNA_DEPTO,COUNT(NOMBRE_COMUNA_DEPTO) FROM DEPARTAMENTOS GROUP BY NOMBRE_COMUNA_DEPTO",
                nativeQuery = true)
    List<String> getCountDeptoByComuna();

    @Query(value = "SELECT NOMBRE_REGION_DEPTO,COUNT(NOMBRE_REGION_DEPTO) FROM DEPARTAMENTOS GROUP BY NOMBRE_REGION_DEPTO",
                nativeQuery = true)
    List<String> getCountDeptoByRegion();

    @Query(value = "SELECT TIPO_DEPTO, COUNT(TIPO_DEPTO) FROM DEPARTAMENTOS GROUP BY TIPO_DEPTO", 
                nativeQuery = true)
    List<String> getCountDeptoByTipo();

    
}