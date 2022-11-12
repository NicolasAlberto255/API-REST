package com.rest.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Roles;
import com.rest.api.repositories.RolesRepository;

@Service
public class RolesService {
    @Autowired
    RolesRepository rolesRepository;

    public List<Roles> getRol() {
        return rolesRepository.findAll();
    }

    public Roles findById(int id) {
        return rolesRepository.findById(id);
    }

    public Roles saveRol(Roles rol) {
        return rolesRepository.save(rol);
    }

    public boolean deleteRol(int id) {
        try {
            rolesRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
