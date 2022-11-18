package com.rest.api.repositories;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.InvDeptoImagen;

@Repository
@Transactional
public interface InvDeptoImagenRepository extends JpaRepository<InvDeptoImagen, Integer> {
    public Optional<InvDeptoImagen> findByNombre(String nombreImagen);

    public InvDeptoImagen findByIdImagen(int idImagen);
}
