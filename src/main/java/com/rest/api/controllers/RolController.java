package com.rest.api.controllers;

import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Rol;
import com.rest.api.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("rol/")
public class RolController {
    
    @Autowired 
    RolService rolService;

    @GetMapping("rolGet/{id}")
    public Rol findById(@PathVariable("id") int id) {
        return this.rolService.findById(id);
    }
}
