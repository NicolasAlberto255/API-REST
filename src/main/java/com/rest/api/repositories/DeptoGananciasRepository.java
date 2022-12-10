package com.rest.api.repositories;

import com.rest.api.models.DeptoGanancias;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DeptoGananciasRepository extends JpaRepository<DeptoGanancias, Integer>{
    
    public DeptoGanancias findByIdDeptoGanancias(int id);

    @Query(value = "SELECT GANANCIA FROM DEPTO_GANANCIAS WHERE ID_DEPTO = ?1", nativeQuery = true)
    public int getGananciaByIdDepto(int idDepto);

    @Query(value = "SELECT NOMBRE_DEPARTAMENTO,SUM(GANANCIA_DEPTO) FROM DEPTO_GANANCIAS GROUP BY NOMBRE_DEPARTAMENTO", nativeQuery = true)
    List<String> getSumaGananciaByIdDepto();

}
