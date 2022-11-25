package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicios")
    private int idServicios;

    @Column(name = "nombreServicios")
    private String nombreServicios;

    @Column(name = "descripcionServicios")
    private String descripcionServicios;

    @Column(name = "precioServicios")
    private int precioServicios;

    @Column(name = "estadoServicios")
    private String estadoServicios;

    @ManyToMany(mappedBy = "servicios")
    @JsonIgnore
    private Set<Reserva> servicios = new HashSet<>();

    public Servicios() {
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombreServicios() {
        return nombreServicios;
    }

    public void setNombreServicios(String nombreServicios) {
        this.nombreServicios = nombreServicios;
    }

    public String getDescripcionServicios() {
        return descripcionServicios;
    }

    public void setDescripcionServicios(String descripcionServicios) {
        this.descripcionServicios = descripcionServicios;
    }

    public int getPrecioServicios() {
        return precioServicios;
    }

    public void setPrecioServicios(int precioServicios) {
        this.precioServicios = precioServicios;
    }

    public String getEstadoServicios() {
        return estadoServicios;
    }

    public void setEstadoServicios(String estadoServicios) {
        this.estadoServicios = estadoServicios;
    }

    public Set<Reserva> getReservas() {
        return servicios;
    }

    public void setReservas(Set<Reserva> servicios) {
        this.servicios = servicios;
    }

    public void addReservas(Reserva servicios) {
        this.servicios.add(servicios);
    }
}
