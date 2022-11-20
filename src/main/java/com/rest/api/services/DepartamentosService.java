package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Departamentos;
import com.rest.api.repositories.DepartamentosRepository;
import java.util.List;

@Service
public class DepartamentosService {
    @Autowired
    DepartamentosRepository departamentosRepository;

    public List<Departamentos> getDepartamentos() {
        return (List<Departamentos>) departamentosRepository.findAll();
    }

    public Departamentos saveDepartamentos(Departamentos departamentos) {
        return departamentosRepository.save(departamentos);
    }

    public List<Departamentos> getDepartamentosByEstado(String estadoDepartamento) {
        return departamentosRepository.getDepartamentosByEstado(estadoDepartamento);
    }

    public Departamentos findById(int id) {
        return departamentosRepository.findById(id);
    }

    public boolean deleteDepartamentos(int id) {
        try {
            departamentosRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}