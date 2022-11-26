package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.repositories.ReservaDeptoRepository;
import com.rest.api.models.ReservaDepartamento;
import java.util.List;

@Service
public class ReservaDepartamentoService {
    
    @Autowired
    ReservaDeptoRepository reservaDeptoRepository;

    public List<ReservaDepartamento> getReservaDepartamentos() {
        return reservaDeptoRepository.findAll();
    }

    public ReservaDepartamento findByIdReserva(int id) {
        return reservaDeptoRepository.findByIdReserva(id);
    }    

    public ReservaDepartamento findByIdDepartamentos(int id) {
        return reservaDeptoRepository.findByIdDepartamentos(id);
    }
}
