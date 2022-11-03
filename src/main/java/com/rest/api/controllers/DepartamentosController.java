package com.rest.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Departamentos;
import com.rest.api.services.DepartamentosService;

@RestController
@RequestMapping("departamentos/")
public class DepartamentosController {

    @Autowired
    DepartamentosService departamentosService;

    @GetMapping("departamentos")
    public ArrayList<Departamentos> getDepartamentos() {
        return departamentosService.getDepartamentos();
    }

    @GetMapping("departamentosGet/{id}")
    public Departamentos findById(@PathVariable("id") int id) {
        return this.departamentosService.findById(id);
    }

    @PostMapping("departamentosSave")
    public String saveDepartamento(@RequestBody Departamentos departamentos) {
        this.departamentosService.saveDepartamentos(departamentos);
        return "Departamento Guardado";
    }

    @PutMapping("departamentosPut/{id}")
    public String updateDepartamentos(@PathVariable("id") int id, @RequestBody Departamentos departamentos) {
        Departamentos departamentosUpdate = departamentosService.findById(id);
        departamentosUpdate.setNombreDepartamento(departamentos.getNombreDepartamento());
        departamentosUpdate.setNombreRegionDepto(departamentos.getNombreRegionDepto());
        departamentosUpdate.setNombreComunaDepto(departamentos.getNombreComunaDepto());
        departamentosUpdate.setnEdificio(departamentos.getnEdificio());
        departamentosUpdate.setnBanos(departamentos.getnBanos());
        departamentosUpdate.setnHabitacion(departamentos.getnHabitacion());
        departamentosUpdate.setBalcon(departamentos.getBalcon());
        departamentosUpdate.setvNoche(departamentos.getvNoche());
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