package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.TipoInventario;
import com.rest.api.repositories.TipoInventarioRepository;
import java.util.ArrayList;

@Service
public class TipoInventarioService {
    @Autowired
    TipoInventarioRepository tipoInventarioRepository;

    public ArrayList<TipoInventario> getTipoInventario() {
        return (ArrayList<TipoInventario>) tipoInventarioRepository.findAll();
    }

    public TipoInventario saveTipoInventario(TipoInventario tipoInventario) {
        return tipoInventarioRepository.save(tipoInventario);
    }

    public TipoInventario findById(Integer id) {
        return tipoInventarioRepository.findById(id).get();
    }

    public boolean deleteTipoInventario(Integer id) {
        try {
            tipoInventarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}