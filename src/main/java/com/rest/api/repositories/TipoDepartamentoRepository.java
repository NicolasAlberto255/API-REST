package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.TipoDepartamento;

@Repository
@Transactional
public interface TipoDepartamentoRepository extends JpaRepository<TipoDepartamento, Integer> {
}