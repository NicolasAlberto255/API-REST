package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Rol;
import com.rest.api.repositories.RolRepository;

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Rol findById(int id) {
        return rolRepository.findById(id);
    }
}
