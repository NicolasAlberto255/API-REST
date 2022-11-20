package com.rest.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.TipoDepartamento;
import com.rest.api.services.TipoDepartamentoService;

@RestController
@RequestMapping("tipoDepartamento/")
public class TipoDepartamentoController {

    @Autowired
    TipoDepartamentoService tipoDepartamentoService;

    @GetMapping("tipoDepartamentos")
    public List<TipoDepartamento> getTipoDepartamento() {
        return tipoDepartamentoService.getTipoDepartamento();
    }

    @GetMapping("tipoDepartamentoGet/{id}")
    public TipoDepartamento findById(@PathVariable("id") int id) {
        return this.tipoDepartamentoService.findById(id);
    }

    @PostMapping("tipoDepartamentoSave")
    public String saveTipoInventario(@RequestBody TipoDepartamento tipoInventario) {
        this.tipoDepartamentoService.saveTipoDepartamento(tipoInventario);
        return "Tipo de Departamento Guardado";
    }

    @PutMapping("tipoDepartamentoUpdate/{id}")
    public String updateTipoDepartamento(@PathVariable("id") int id, @RequestBody TipoDepartamento tipoDepartamento) {
        TipoDepartamento tipoDepartamentoUpdate = tipoDepartamentoService.findById(id);
        tipoDepartamentoUpdate.setNombreTipo(tipoDepartamento.getNombreTipo());
        tipoDepartamentoService.saveTipoDepartamento(tipoDepartamentoUpdate);
        return "Tipo de Departamento actualizado";
    }

    @DeleteMapping("tipoDepartamentoDelete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        boolean ok = this.tipoDepartamentoService.deleteTipoDepartamento(id);
        if (ok) {
            return "Se eliminó el Tipo de Departamento con id " + id;
        } else {
            return "No se pudo eliminar el Tipo de Departamento con id " + id;
        }
    }
}