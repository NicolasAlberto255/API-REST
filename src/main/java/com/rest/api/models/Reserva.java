package com.rest.api.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReserva")
    private int idReserva;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "America/Santiago", shape = JsonFormat.Shape.STRING)
    @Column(name = "fechaInicio")
    private Date fechaInicio;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "America/Santiago", shape = JsonFormat.Shape.STRING)
    @Column(name = "fechaFin")
    private Date fechaFin;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "America/Santiago", shape = JsonFormat.Shape.STRING)
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;

    @Column(name = "precioAbono")
    private int precioAbono;

    @Column(name = "precioTotal")
    private int precioTotal;

    @Column(name = "estadoReserva")
    private String estadoReserva;

    @Column(name = "cntPersonas")
    private int cntPersonas;

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.ALL })
    @JoinTable(
        name = "reserva_servicios", 
        joinColumns = @JoinColumn(
            name = "idReserva"), 
            inverseJoinColumns = @JoinColumn(
                name = "idServicios"))
    @JsonIgnore
    private Set<Servicios> servicios = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.ALL })
    @JoinTable(
        name = "reserva_usuario", 
        joinColumns = @JoinColumn(
            name = "idReserva"), 
            inverseJoinColumns = @JoinColumn(
                name = "idUsuario"))
    @JsonIgnore
    private Set<Usuarios> usuarios = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinTable(
        name="reserva_departamentos",
        joinColumns = @JoinColumn(
            name = "idReserva"),
            inverseJoinColumns = @JoinColumn(
                name = "idDepartamentos"))
    @JsonIgnore
    private Set<Departamentos> departamentos = new HashSet<>();

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getPrecioAbono() {
        return precioAbono;
    }

    public void setPrecioAbono(int precioAbono) {
        this.precioAbono = precioAbono;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public int getCntPersonas() {
        return cntPersonas;
    }

    public void setCntPersonas(int cntPersonas) {
        this.cntPersonas = cntPersonas;
    }

    public Set<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Servicios> servicios) {
        this.servicios = servicios;
    }

    public Set<Departamentos> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamentos> departamentos) {
        this.departamentos = departamentos;
    }

    public Set<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
}
