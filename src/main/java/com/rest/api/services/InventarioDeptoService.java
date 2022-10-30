package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.InventarioDepto;
import com.rest.api.repositories.InventarioDeptoRepository;
import java.util.ArrayList;

@Service
public class InventarioDeptoService {
    @Autowired
    InventarioDeptoRepository inventarioDeptoRepository;

    public ArrayList<InventarioDepto> getInventarioDepto() {
        return (ArrayList<InventarioDepto>) inventarioDeptoRepository.findAll();
    }

    public InventarioDepto saveInventarioDepto(InventarioDepto inventarioDepto) {
        return inventarioDeptoRepository.save(inventarioDepto);
    }

    public InventarioDepto findById(Integer id) {
        return inventarioDeptoRepository.findById(id).get();
    }

    public boolean deleteInventarioDepto(Integer id) {
        try {
            inventarioDeptoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}