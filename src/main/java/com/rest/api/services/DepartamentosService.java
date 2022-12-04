package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Departamentos;
import com.rest.api.models.Servicios;
import com.rest.api.repositories.*;
import com.rest.api.reservaRequests.DeptoRequest;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartamentosService {
    @Autowired
    DepartamentosRepository departamentosRepository;

    @Autowired
    ServiciosRepository serviciosRepository;

    public Departamentos addDeptoServicio(DeptoRequest deptoRequest)
    {
        Departamentos departamentos = new Departamentos();
        departamentos.setIdDepartamentos(deptoRequest.id);
        departamentos.setNombreDepartamento(deptoRequest.nombreDepartamento);
        departamentos.setNombreRegionDepto(deptoRequest.nombreRegionDepto);
        departamentos.setNombreComunaDepto(deptoRequest.nombreComunaDepto);
        departamentos.setDireccionDepartamento(deptoRequest.direccionDepartamento);
        departamentos.setnEdificio(deptoRequest.nEdificio);
        departamentos.setnDepto(deptoRequest.nDepto);
        departamentos.setnHabitacion(deptoRequest.nHabitacion);
        departamentos.setnBanos(deptoRequest.nBanos);
        departamentos.setvNoche(deptoRequest.vNoche);
        departamentos.setBalcon(deptoRequest.balcon);
        departamentos.setTipoDepto(deptoRequest.tipoDepto);
        departamentos.setEstadoDepartamento(deptoRequest.estadoDepartamento);
        departamentos.setServicios(deptoRequest.servicios.stream().map(servicios -> {
            Servicios serviciosContents = servicios;
            if (servicios.getIdServicios() > 0) {
                serviciosContents = serviciosRepository.findById(servicios.getIdServicios());
            }
            serviciosContents.addDepartamentos(departamentos);
            return serviciosContents;
        }).collect(Collectors.toSet()));
        return departamentosRepository.save(departamentos);
    }

    public List<Departamentos> getDepartamentos() {
        return (List<Departamentos>) departamentosRepository.findAll();
    }

    public int getCountDepto() {
        return departamentosRepository.getCountDepto();
    }

    public List<String> getCountDeptoByEstado() {
        return departamentosRepository.getCountDeptoByEstado();
    }

    public List<String> getCountDeptoByComuna(){
        return departamentosRepository.getCountDeptoByComuna();
    }

    public List<String> getCountDeptoByRegion(){
        return departamentosRepository.getCountDeptoByRegion();
    }

    public List<String> getCountDeptoByTipo(){
        return departamentosRepository.getCountDeptoByTipo();
    }

    public List<Integer> getVNoche(){
        return departamentosRepository.getVNoche();
    }

    public Departamentos saveDepartamentos(Departamentos departamentos) {
        return departamentosRepository.save(departamentos);
    }

    public List<Departamentos> getDepartamentosByEstado(String estadoDepartamento) {
        return departamentosRepository.getDepartamentosByEstado(estadoDepartamento);
    }

    public Departamentos findById(int id) {
        return departamentosRepository.findById(id);
    }

    public boolean deleteDepartamentos(int id) {
        try {
            departamentosRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}