package com.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Provincia;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {

    Provincia findById(int id);

    @Query("FROM Provincia WHERE id = ?1")
    List<Provincia> getByIds(Set<Integer> id);

    List<Provincia> findByNombreProvinciaAndIdRegion(String nombreProvincia, int idRegion);

    List<Provincia> getProvinciasByIdRegion(int idRegion);

    @Query(value = "SELECT ID_PROVINCIA, ID_REGION FROM PROVINCIA WHERE ID_PROVINCIA = ?1 AND ID_REGION = ?2", nativeQuery = true)
    List<Object[]> getByIdProvinciaAndIdRegion(@Param("idProvincia") int idProvincia, @Param("idRegion") int idRegion);

    List<Provincia> findByNombreProvincia(String nombreProvincia);

}