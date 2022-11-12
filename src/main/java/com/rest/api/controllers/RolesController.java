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

    @GetMapping("getRol")
    public List<Roles> getRol() {
        return rolesService.getRol();
    }
    @GetMapping("rolGet/{id}")
    public Roles findById(@PathVariable("id") int id) {
        return this.rolesService.findById(id);
    }

    @PostMapping("rolPost")
    public Roles saveRol(@RequestBody Roles rol) {
        return this.rolesService.saveRol(rol);
    }

    @PostMapping("updateRol")
    public Roles updateRol(@RequestBody Roles rol) {
        return this.rolesService.saveRol(rol);
    }

    @DeleteMapping("deleteRol/{id}")
    public boolean deleteRol(@PathVariable("id") int id) {
        return this.rolesService.deleteRol(id);
    }
}
