package com.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Comuna;
import java.util.List;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Integer> {

    Comuna findById(int id);

    List<Comuna> findByNombreComuna(String nombreComuna);

    List<Comuna> getComunasByIdRegion(int id);

    @Query(value = "SELECT ID_COMUNA, ID_REGION FROM COMUNA WHERE ID_COMUNA = ?1 AND ID_REGION = ?2", nativeQuery = true)
    List<Object[]> getByIdComunaAndIdRegion(@Param("idComuna") int idComuna, @Param("idRegion") int idProvincia);

    @Query(value = "SELECT NOMBRE_COMUNA, ID_REGION FROM COMUNA WHERE NOMBRE_COMUNA = ?1 AND ID_REGION = ?2", nativeQuery = true)
    List<Object[]> getByNombreComunaAndIdRegion(@Param("nombreComuna") String nombreComuna,
            @Param("idRegion") int idProvincia);

}
