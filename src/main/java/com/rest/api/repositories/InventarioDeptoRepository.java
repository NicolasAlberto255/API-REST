package com.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.InventarioDepto;

@Repository
public interface InventarioDeptoRepository extends JpaRepository<InventarioDepto, Integer> {
}