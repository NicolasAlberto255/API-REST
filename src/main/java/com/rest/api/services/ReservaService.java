package com.rest.api.services;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.*;
import com.rest.api.repositories.*;
import com.rest.api.reservaRequests.ReservaRequest;

@Service
public class ReservaService {
    @Autowired
    ServiciosRepository serviciosRepository;

    @Autowired
    ReservaRepository reservaRepository;

    @Autowired
    DepartamentosRepository departamentosRepository;

    @Autowired
    UsuariosRepository usuariosRepository;

    @Autowired
    DepartamentosService departamentosService;

    

    public Reserva addReservaServicios(ReservaRequest reservaRequest) {
        Reserva reserva = new Reserva();
        reserva.setIdReserva(reservaRequest.id);
        reserva.setFechaInicio(reservaRequest.fechaInicio);
        reserva.setFechaFin(reservaRequest.fechaFin);
        reserva.setFechaCreacion(reservaRequest.fechaCreacion);
        reserva.setPrecioAbono(reservaRequest.precioAbono);
        reserva.setPrecioTotal(reservaRequest.precioTotal);
        reserva.setEstadoReserva(reservaRequest.estadoReserva);
        reserva.setUsuarios(reservaRequest.usuarios.stream().map(usuarios -> {
            Usuarios usuariosContents = usuarios;
            if (usuarios.getIdUsuario() > 0) {
                usuariosContents = usuariosRepository.findById(usuarios.getIdUsuario());
            }
            usuariosContents.addReservas(reserva);
            return usuariosContents;
        }).collect(Collectors.toSet()));
        reserva.setDepartamentos(reservaRequest.departamentos.stream().map(departamentos -> {
            Departamentos departamentosContents = departamentos;
            if (departamentos.getIdDepartamentos() > 0) {
                departamentosContents = departamentosRepository.findById(departamentos.getIdDepartamentos());
                departamentosContents.setEstadoDepartamento("Reservado");
            }
            departamentosContents.addReservas(reserva);
            return departamentos;
        }).collect(Collectors.toSet()));
        reserva.setServicios(reservaRequest.servicios.stream().map(servicios -> {
            Servicios serviciosContents = servicios;
            if (serviciosContents.getIdServicios() > 0) {
                serviciosContents = serviciosRepository.findById(serviciosContents.getIdServicios());
            }
            serviciosContents.addReservas(reserva);
            return serviciosContents;
        }).collect(Collectors.toSet()));

        return reservaRepository.save(reserva);
    }

    public List<Reserva> findByFechaInicio(Date fechaInicio) {
        return reservaRepository.findByFechaInicio(fechaInicio);
    }

    public List<Reserva> findByFechaFin(Date fechaFin) {
        return reservaRepository.findByFechaFin(fechaFin);
    }

    public List<Reserva> findByFechaCreacion(Date fechaCreacion) {
        return reservaRepository.findByFechaCreacion(fechaCreacion);
    }

    public List<Reserva> getReservasByEstado(String estadoReserva) {
        return reservaRepository.getReservasByEstado(estadoReserva);
    }

    public List<Reserva> getReserva() {
        return reservaRepository.findAll();
    }

    public Reserva findById(int idReserva) {
        return reservaRepository.findById(idReserva);
    }

    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva addReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public boolean deleteReserva(Integer id) {
        try {
            reservaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public List<Reserva> getReservas() {
        return reservaRepository.findAll();
    }
}