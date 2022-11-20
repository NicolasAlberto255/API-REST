package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.TipoDepartamento;
import com.rest.api.repositories.TipoDepartamentoRepository;
import java.util.List;

@Service
public class TipoDepartamentoService {
    @Autowired
    TipoDepartamentoRepository tipoDepartamentoRepository;

    public List<TipoDepartamento> getTipoDepartamento() {
        return (List<TipoDepartamento>) tipoDepartamentoRepository.findAll();
    }

    public TipoDepartamento saveTipoDepartamento(TipoDepartamento tipoInventario) {
        return tipoDepartamentoRepository.save(tipoInventario);
    }

    public TipoDepartamento findById(int id) {
        return tipoDepartamentoRepository.findById(id).get();
    }

    public boolean deleteTipoDepartamento(int id) {
        try {
            tipoDepartamentoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}