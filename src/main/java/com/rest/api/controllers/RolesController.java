package com.rest.api.controllers;

import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Roles;
import com.rest.api.services.RolesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("rol/")
public class RolesController {
    
    @Autowired 
    RolesService rolesService;

    @GetMapping("roles")
    public List<Roles> getRol() {
        return rolesService.getRol();
    }
    @GetMapping("{id}")
    public Roles findById(@PathVariable("id") int id) {
        return this.rolesService.findById(id);
    }

    @PostMapping("rolSave")
    public Roles saveRol(@RequestBody Roles rol) {
        return this.rolesService.saveRol(rol);
    }

    @PostMapping("rolUpdate/{id}")
    public Roles updateRol(@RequestBody Roles rol) {
        return this.rolesService.saveRol(rol);
    }
}
