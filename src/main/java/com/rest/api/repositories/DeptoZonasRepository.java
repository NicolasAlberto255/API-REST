package com.rest.api.repositories;

import com.rest.api.models.DeptoZonas;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DeptoZonasRepository extends JpaRepository<DeptoZonas, Integer>{
        
        public DeptoZonas getZonaByIdDeptoZonas(int id);

        @Query(value = "SELECT VALOR_ZONA FROM DEPTO_ZONAS WHERE ID_DEPTO_ZONAS = ?1", nativeQuery = true)
        public int getValorZonaByIdDeptoZonas(int id);

        @Query(value = "SELECT NOMBRE_ZONA FROM DEPTO_ZONAS WHERE ID_DEPTO_ZONAS = ?1", nativeQuery = true)
        public String getNombreZonaByIdDeptoZonas(int id);

        @Query(value = "SELECT NOMBRE_ZONA, SUM(GANANCIA_ZONA) FROM DEPTO_ZONAS GROUP BY NOMBRE_ZONA ORDER BY NOMBRE_ZONA ASC", nativeQuery = true)
        List<String> getSumaByNombreZonas();
}
