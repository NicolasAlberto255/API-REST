package com.rest.api.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.TipoDepartamentoImagen;

@Repository
public interface TipoDepartamentoImagenRepository extends JpaRepository<TipoDepartamentoImagen, Integer> {

    public Optional<TipoDepartamentoImagen> findByNombre(String nombreImagen);

    public TipoDepartamentoImagen findByIdImagen(int idImagen);
}
