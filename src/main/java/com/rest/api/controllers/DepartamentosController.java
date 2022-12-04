package com.rest.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Departamentos;
import com.rest.api.reservaRequests.DeptoRequest;
import com.rest.api.services.DepartamentosService;

@RestController
@RequestMapping("departamentos/")
public class DepartamentosController {

    @Autowired
    DepartamentosService departamentosService;

    @GetMapping("departamentos")
    public List<Departamentos> getDepartamentos() {
        return departamentosService.getDepartamentos();
    }

    @GetMapping("estadoDepartamento")
    public List<Departamentos> getDepartamentosByEstado(@RequestParam String estadoDepartamento) {
        return departamentosService.getDepartamentosByEstado(estadoDepartamento);
    }

    @GetMapping("departamentosGet/{id}")
    public Departamentos findById(@PathVariable("id") int id) {
        return this.departamentosService.findById(id);
    }

    @GetMapping("countDepto")
    public int getCountDepto() {
        return this.departamentosService.getCountDepto();
    }

    @GetMapping("countDeptoByEstado")
    public Map<String, String> getCountDeptoByEstado() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = this.departamentosService.getCountDeptoByEstado();
        
        for (String string : list) {
            String[] parts = string.split(",");
            map.put(parts[0], parts[1]);
        }
        return map;
    }

    @GetMapping("countDeptoByComuna")
    public Map<String, String> getCountDeptoByComuna() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = this.departamentosService.getCountDeptoByComuna();
        
        for (String string : list) {
            String[] parts = string.split(",");
            map.put(parts[0], parts[1]);
        }
        return map;
    }

    @GetMapping("countDeptoByRegion")
    public Map<String, String> getCountDeptoByRegion() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = this.departamentosService.getCountDeptoByRegion();
        
        for (String string : list) {
            String[] parts = string.split(",");
            map.put(parts[0], parts[1]);
        }
        return map;
    }

    @GetMapping("countDeptoByTipo")
    public Map<String, String> getCountDeptoByTipo() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = this.departamentosService.getCountDeptoByTipo();
        
        for (String string : list) {
            String[] parts = string.split(",");
            map.put(parts[0], parts[1]);
        }
        return map;
    }

    @GetMapping("vNoche")
    public List<Integer> getVNoche() {
        return this.departamentosService.getVNoche();
    }

    @PostMapping("departamentosSave")
    public String saveDepartamento(@RequestBody Departamentos departamentos) {
        this.departamentosService.saveDepartamentos(departamentos);
        return "Departamento Guardado";
    }

    @PostMapping("deptoAdd")
    public String addDepartamento(@RequestBody DeptoRequest deptoRequest) {
        this.departamentosService.addDeptoServicio(deptoRequest);
        return "Departamento Agregado";
    }

    @PutMapping("departamentosUpdate/{id}")
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
        departamentosUpdate.setEstadoDepartamento(departamentos.getEstadoDepartamento());
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