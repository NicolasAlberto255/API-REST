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
