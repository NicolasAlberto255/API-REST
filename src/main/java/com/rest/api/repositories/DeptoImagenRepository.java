package com.rest.api.repositories;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.DeptoImagen;

@Repository
@Transactional
public interface DeptoImagenRepository extends JpaRepository<DeptoImagen, Integer> {

    public Optional<DeptoImagen> findByNombre(String nombreImagen);

    public DeptoImagen findByIdImagen(int idImagen);
}
