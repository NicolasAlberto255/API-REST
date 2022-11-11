package com.rest.api.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Rol;

@Repository
@Transactional
public interface RolRepository extends JpaRepository<Rol, Integer> {

    public Rol findById(int id);
}
