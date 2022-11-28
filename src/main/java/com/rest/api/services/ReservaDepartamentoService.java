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

    public List<ReservaDepartamento> getReservaDeptoByIdReserva(int id) {
        return reservaDeptoRepository.getReservaDeptoByIdReserva(id);
    }    

    public List<ReservaDepartamento> getReservaDeptoByIdDepto(int id) {
        return reservaDeptoRepository.getReservaDeptoByIdDepto(id);
    }
}
