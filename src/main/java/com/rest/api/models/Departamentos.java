package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamentos")
public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartamentos")
    private int id;

    @Column(name = "nombreDepartamento")
    private String nombreDepartamento;

    @Column(name = "nombreRegionDepto")
    private String nombreRegionDepto;

    @Column(name = "nombreProvinciaDepto")
    private String nombreProvinciaDepto;

    @Column(name = "nombreComunaDepto")
    private String nombreComunaDepto;

    @Column(name = "nEdificio")
    private int nEdificio;

    @Column(name = "nDepto")
    private int nDepto;

    @Column(name = "nHabitacion")
    private int nHabitacion;

    @Column(name = "nBanos")
    private int nBanos;

    @Column(name = "balcon")
    private Boolean balcon;

    @ManyToMany(mappedBy = "departamentos")
    @JsonIgnore
    private Set<Reserva> departamentos = new HashSet<>();

    @OneToOne(mappedBy = "departamentos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private InventarioDepto inventarioDepto;

    public Departamentos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreRegionDepto() {
        return nombreRegionDepto;
    }

    public void setNombreRegionDepto(String nombreRegionDepto) {
        this.nombreRegionDepto = nombreRegionDepto;
    }

    public String getNombreProvinciaDepto() {
        return nombreProvinciaDepto;
    }

    public void setNombreProvinciaDepto(String nombreProvinciaDepto) {
        this.nombreProvinciaDepto = nombreProvinciaDepto;
    }

    public String getNombreComunaDepto() {
        return nombreComunaDepto;
    }

    public void setNombreComunaDepto(String nombreComunaDepto) {
        this.nombreComunaDepto = nombreComunaDepto;
    }

    public int getnEdificio() {
        return nEdificio;
    }

    public void setnEdificio(int nEdificio) {
        this.nEdificio = nEdificio;
    }

    public int getnDepto() {
        return nDepto;
    }

    public void setnDepto(int nDepto) {
        this.nDepto = nDepto;
    }

    public int getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(int nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public int getnBanos() {
        return nBanos;
    }

    public void setnBanos(int nBanos) {
        this.nBanos = nBanos;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public Set<Reserva> getReservas() {
        return departamentos;
    }

    public void setReservas(Set<Reserva> departamentos) {
        this.departamentos = departamentos;
    }

    public void addReservas(Reserva departamentos) {
        this.departamentos.add(departamentos);
    }

}
