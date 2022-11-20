package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.InventarioDepto;
import com.rest.api.repositories.InventarioDeptoRepository;
import java.util.List;

@Service
public class InventarioDeptoService {
    @Autowired
    InventarioDeptoRepository inventarioDeptoRepository;

    public List<InventarioDepto> getInventarioDepto() {
        return (List<InventarioDepto>) inventarioDeptoRepository.findAll();
    }

    public InventarioDepto saveInventarioDepto(InventarioDepto inventarioDepto) {
        return inventarioDeptoRepository.save(inventarioDepto);
    }

    public InventarioDepto findById(int id) {
        return inventarioDeptoRepository.findById(id).get();
    }

    public boolean deleteInventarioDepto(int id) {
        try {
            inventarioDeptoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}