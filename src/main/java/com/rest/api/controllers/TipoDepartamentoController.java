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
    TipoDepartamentoService tipoDepartamentoRepository;

    @GetMapping("tipoDepartamentos")
    public List<TipoDepartamento> getTipoDepartamento() {
        return tipoDepartamentoRepository.getTipoDepartamento();
    }

    @GetMapping("tipoDepartamentoGet/{id}")
    public TipoDepartamento findById(@PathVariable("id") Integer id) {
        return this.tipoDepartamentoRepository.findById(id);
    }

    @PostMapping("tipoDepartamentoSave")
    public String saveTipoInventario(@RequestBody TipoDepartamento tipoInventario) {
        this.tipoDepartamentoRepository.saveTipoDepartamento(tipoInventario);
        return "Tipo de Departamento Guardado";
    }

    @PutMapping("tipoDepartamentoUpdate/{id}")
    public String updateTipoDepartamento(@PathVariable("id") Integer id, @RequestBody TipoDepartamento tipoDepartamento) {
        TipoDepartamento tipoDepartamentoUpdate = tipoDepartamentoRepository.findById(id);
        tipoDepartamentoUpdate.setNombreTipo(tipoDepartamento.getNombreTipo());
        tipoDepartamentoRepository.saveTipoDepartamento(tipoDepartamentoUpdate);
        return "Tipo de Departamento actualizado";
    }

    @DeleteMapping("tipoDepartamentoDelete/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.tipoDepartamentoRepository.deleteTipoDepartamento(id);
        if (ok) {
            return "Se eliminó el Tipo de Departamento con id " + id;
        } else {
            return "No se pudo eliminar el Tipo de Departamento con id " + id;
        }
    }
}