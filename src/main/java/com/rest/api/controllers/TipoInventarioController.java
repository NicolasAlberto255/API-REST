package com.rest.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.TipoInventario;
import com.rest.api.services.TipoInventarioService;

@RestController
@RequestMapping("tipoInventario/")
public class TipoInventarioController {

    @Autowired
    TipoInventarioService tipoInventarioService;

    @GetMapping("tipoInventario")
    public ArrayList<TipoInventario> getTipoInventario() {
        return tipoInventarioService.getTipoInventario();
    }

    @GetMapping("tipoInventarioGet/{id}")
    public TipoInventario findById(@PathVariable("id") Integer id) {
        return this.tipoInventarioService.findById(id);
    }

    @PostMapping("tipoInventarioSave")
    public String saveTipoInventario(@RequestBody TipoInventario tipoInventario) {
        this.tipoInventarioService.saveTipoInventario(tipoInventario);
        return "Tipo de Inventario Guardado";
    }

    @PutMapping("tipoInventarioPut/{id}")
    public String updateTipoInventario(@PathVariable("id") Integer id, @RequestBody TipoInventario tipoInventario) {
        TipoInventario tipoInventarioUpdate = tipoInventarioService.findById(id);
        tipoInventarioUpdate.setNombreTipo(tipoInventario.getNombreTipo());
        tipoInventarioService.saveTipoInventario(tipoInventarioUpdate);
        return "Tipo de Inventario actualizado";
    }

    @DeleteMapping("tipoInventarioDelete/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.tipoInventarioService.deleteTipoInventario(id);
        if (ok) {
            return "Se eliminó el Tipo de Inventario In con id " + id;
        } else {
            return "No se pudo eliminar el Tipo de Inventario con id " + id;
        }
    }
}