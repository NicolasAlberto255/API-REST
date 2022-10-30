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
    private int id;

    @Column(name = "nombreServicios")
    private String nombreServicios;

    @Column(name = "descripcionServicios")
    private String descripcionServicios;

    @ManyToMany(mappedBy = "servicios")
    @JsonIgnore
    private Set<Reserva> servicios = new HashSet<>();

    public Servicios() {
    }

    public Servicios(int id, String nombreServicios, String descripcionServicios) {
        this.id = id;
        this.nombreServicios = nombreServicios;
        this.descripcionServicios = descripcionServicios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
