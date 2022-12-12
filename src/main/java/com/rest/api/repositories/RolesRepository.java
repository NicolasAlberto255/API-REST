package com.rest.api.repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rest.api.models.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    public Roles findById(int id);
}
