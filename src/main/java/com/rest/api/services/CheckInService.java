package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.CheckIn;
import com.rest.api.repositories.CheckInRepository;
import java.util.ArrayList;

@Service
public class CheckInService {
    @Autowired
    CheckInRepository checkInRepository;

    public ArrayList<CheckIn> getCheckIn() {
        return (ArrayList<CheckIn>) checkInRepository.findAll();
    }

    public CheckIn saveCheckIn(CheckIn checkIn) {
        return checkInRepository.save(checkIn);
    }

    public CheckIn findById(int id) {
        return checkInRepository.findById(id).get();
    }
}