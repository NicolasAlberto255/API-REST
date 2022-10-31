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
public class ReservaServicioService {
    @Autowired
    ServiciosRepository serviciosRepository;

    @Autowired
    ReservaRepository reservaRepository;

    @Autowired
    DepartamentosRepository departamentosRepository;

    @Autowired
    UsuariosRepository usuariosRepository;

    public ReservaServicioService() {
    }

    public List<Servicios> getServicios() {
        return serviciosRepository.findAll();
    }

    public Servicios saveServicios(Servicios servicios) {
        return serviciosRepository.save(servicios);
    }

    public List<Servicios> findServicioByNombreServicios(String nombreServicios) {
        return serviciosRepository.findServicioByNombreServicios(nombreServicios);
    }

    public Servicios findById(Integer id) {
        return serviciosRepository.findById(id).get();
    }

    public Reserva addReservaServicios(ReservaRequest reservaRequest) {
        Reserva reserva = new Reserva();
        reserva.setId(reservaRequest.id);
        reserva.setFechaInicio(reservaRequest.fechaInicio);
        reserva.setFechaFin(reservaRequest.fechaFin);
        reserva.setFechaCreacion(reservaRequest.fechaCreacion);
        reserva.setPrecioAbono(reservaRequest.precioAbono);
        reserva.setUsuarios(reservaRequest.usuarios.stream().map(usuarios -> {
            Usuarios usuariosContents = usuarios;
            if (usuarios.getId() > 0) {
                usuariosContents = usuariosRepository.findById(usuarios.getId());
            }
            usuariosContents.addReservas(reserva);
            return usuariosContents;
        }).collect(Collectors.toSet()));
        reserva.setDepartamentos(reservaRequest.departamentos.stream().map(departamentos -> {
            Departamentos departamentosContents = departamentos;
            if (departamentos.getId() > 0) {
                departamentosContents = departamentosRepository.findById(departamentos.getId());
            }
            departamentosContents.addReservas(reserva);
            return departamentos;
        }).collect(Collectors.toSet()));
        reserva.setServicios(reservaRequest.servicios.stream().map(servicios -> {
            Servicios serviciosContents = servicios;
            if (serviciosContents.getId() > 0) {
                serviciosContents = serviciosRepository.findById(serviciosContents.getId());
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

    public List<Reserva> getByPrecioAbono(int precioAbono) {
        return reservaRepository.getByPrecioAbono(precioAbono);
    }

    public Reserva getById(int idReserva) {
        return reservaRepository.getById(idReserva);
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