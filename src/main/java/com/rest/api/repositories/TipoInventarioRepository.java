package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.TipoInventario;

@Repository
@Transactional
public interface TipoInventarioRepository extends JpaRepository<TipoInventario, Integer> {
}