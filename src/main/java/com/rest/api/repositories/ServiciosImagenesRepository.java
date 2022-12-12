package com.rest.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.rest.api.models.ServiciosImagenes;

@Repository
public interface ServiciosImagenesRepository extends JpaRepository<ServiciosImagenes, Integer> {
    
    public Optional<ServiciosImagenes> findByNombre(String nombreImagen);

    public ServiciosImagenes findByIdImagen(int idImagen);

    @Query(value = "SELECT * FROM SERVICIOS_IMAGENES WHERE ID_SERVICIOS = ?1", nativeQuery = true)
    public List<ServiciosImagenes> getImagenesByIdServicio(int idServicios);

    public void deleteImagenByNombre(String nombreImagen);
}
