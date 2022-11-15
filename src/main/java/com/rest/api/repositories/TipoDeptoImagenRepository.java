package com.rest.api.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.TipoDeptoImagen;

@Repository
public interface TipoDeptoImagenRepository extends JpaRepository<TipoDeptoImagen, Integer> {

    public Optional<TipoDeptoImagen> findByNombre(String nombreImagen);

    public TipoDeptoImagen findByIdImagen(int idImagen);
}
