package com.rest.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Departamentos;
import com.rest.api.services.DepartamentosService;

@RestController
public class DepartamentosController {

    @Autowired
    DepartamentosService departamentosService;

    @GetMapping("departamentosGet")
    public ArrayList<Departamentos> getDepartamentos() {
        return departamentosService.getDepartamentos();
    }

    @GetMapping("departamentosGet/{id}")
    public Departamentos findById(@PathVariable("id") int id) {
        return this.departamentosService.findById(id);
    }

    @PostMapping("departamentosSave")
    public String saveCheckIn(@RequestBody Departamentos departamentos) {
        this.departamentosService.saveDepartamentos(departamentos);
        return "Departamento Guardado";
    }

    @PutMapping("departamentosPut/{id}")
    public String updateDepartamentos(@PathVariable("id") int id, @RequestBody Departamentos departamentos) {
        Departamentos departamentosUpdate = departamentosService.findById(id);
        departamentosUpdate.setIdRegionDepto(departamentos.getIdRegionDepto());
        departamentosUpdate.setIdCiudadDepto(departamentos.getIdCiudadDepto());
        departamentosUpdate.setIdComunaDepto(departamentos.getIdComunaDepto());
        departamentosUpdate.setnEdificio(departamentos.getnEdificio());
        departamentosUpdate.setnBanos(departamentos.getnBanos());
        departamentosUpdate.setnHabitacion(departamentos.getnHabitacion());
        departamentosUpdate.setBalcon(departamentos.getBalcon());
        departamentosService.saveDepartamentos(departamentosUpdate);
        return "Departamentos actualizados";
    }

    @DeleteMapping("departamentosDelete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.departamentosService.deleteDepartamentos(id);
        if (ok) {
            return "Se eliminó el departamento In con id " + id;
        } else {
            return "No se pudo eliminar el departamento con id " + id;
        }
    }
}