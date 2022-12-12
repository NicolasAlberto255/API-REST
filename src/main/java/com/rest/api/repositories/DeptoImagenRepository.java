package com.rest.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.rest.api.models.DeptoImagen;

@Repository
public interface DeptoImagenRepository extends JpaRepository<DeptoImagen, Integer> {

    public Optional<DeptoImagen> findByNombre(String nombreImagen);

    public DeptoImagen findByIdImagen(int idImagen);

    @Query(value = "SELECT * FROM DEPTO_IMAGEN WHERE ID_DEPARTAMENTOS = ?1", nativeQuery = true)
    public List<DeptoImagen> getImagenesByIdDepartamento(int idDepartamentos);

    public void deleteImagenByNombre(String nombreImagen);
    
}
