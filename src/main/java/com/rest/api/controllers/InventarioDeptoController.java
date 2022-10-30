package com.rest.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.InventarioDepto;
import com.rest.api.services.InventarioDeptoService;

@RestController
@RequestMapping("inventarioDepto/")
public class InventarioDeptoController {

    @Autowired
    InventarioDeptoService inventarioDeptoService;

    @GetMapping("inventarioDeptoGet")
    public ArrayList<InventarioDepto> getInventarioDepto() {
        return inventarioDeptoService.getInventarioDepto();
    }

    @GetMapping("inventarioDeptoGet/{id}")
    public InventarioDepto findById(@PathVariable("id") Integer id) {
        return this.inventarioDeptoService.findById(id);
    }

    @PostMapping("inventarioDeptoSave")
    public String saveInventarioDepto(@RequestBody InventarioDepto inventarioDepto) {
        this.inventarioDeptoService.saveInventarioDepto(inventarioDepto);
        return "Inventario Guardado";
    }

    @PutMapping("inventarioDeptoPut/{id}")
    public String updateInventarioDepto(@PathVariable("id") Integer id, @RequestBody InventarioDepto inventarioDepto) {
        InventarioDepto inventarioDeptoUpdate = inventarioDeptoService.findById(id);
        inventarioDeptoUpdate.setDescripcion(inventarioDepto.getDescripcion());
        inventarioDeptoService.saveInventarioDepto(inventarioDeptoUpdate);
        return "Inventario de Departamento actualizada";
    }

    @DeleteMapping("inventarioDeptoDelete/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.inventarioDeptoService.deleteInventarioDepto(id);
        if (ok) {
            return "Se eliminó el Inventario de Departamento con id " + id;
        } else {
            return "No se pudo eliminar el Inventario de Departamento con id " + id;
        }
    }
}