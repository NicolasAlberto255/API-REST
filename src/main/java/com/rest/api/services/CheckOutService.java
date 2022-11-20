package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.CheckOut;
import com.rest.api.repositories.CheckOutRepository;
import java.util.List;

@Service
public class CheckOutService {
    @Autowired
    CheckOutRepository checkOutRepository;

    public List<CheckOut> getCheckOut() {
        return (List<CheckOut>) checkOutRepository.findAll();
    }

    public CheckOut saveCheckOut(CheckOut checkOut) {
        return checkOutRepository.save(checkOut);
    }

    public CheckOut findById(int id) {
        return checkOutRepository.findById(id).get();
    }

    public boolean deleteCheckOut(int id) {
        try {
            checkOutRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
