package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.CheckOut;
import com.rest.api.repositories.CheckOutRepository;
import java.util.ArrayList;

@Service
public class CheckOutService {
    @Autowired
    CheckOutRepository checkOutRepository;

    public ArrayList<CheckOut> getCheckOut() {
        return (ArrayList<CheckOut>) checkOutRepository.findAll();
    }

    public CheckOut saveCheckOut(CheckOut checkOut) {
        return checkOutRepository.save(checkOut);
    }

    public CheckOut findById(int id) {
        return checkOutRepository.findById(id).get();
    }
}
