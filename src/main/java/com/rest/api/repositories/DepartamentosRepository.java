package com.rest.api.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Departamentos;

@Repository
@Transactional
public interface DepartamentosRepository extends JpaRepository<Departamentos, Integer> {
    public Departamentos findById(int id);
}