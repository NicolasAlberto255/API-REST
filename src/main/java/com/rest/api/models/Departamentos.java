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
    private int idDepartamentos;

    @Column(name = "nombreDepartamento")
    private String nombreDepartamento;

    @Column(name = "nombreRegionDepto")
    private String nombreRegionDepto;

    @Column(name = "nombreComunaDepto")
    private String nombreComunaDepto;

    @Column(name = "direccionDepartamento")
    private String direccionDepartamento;

    @Column(name = "nEdificio")
    private int nEdificio;

    @Column(name = "nDepto")
    private int nDepto;

    @Column(name = "nHabitacion")
    private int nHabitacion;

    @Column(name = "nBanos")
    private int nBanos;

    @Column(name = "vNoche")
    private int vNoche;

    @Column(name = "balcon")
    private Boolean balcon;

    @Column(name = "tipoDepto")
    private String tipoDepto;

    @Column(name = "estadoDepartamento")
    private String estadoDepartamento;

    @ManyToMany(mappedBy = "departamentos")
    @JsonIgnore
    private Set<Reserva> departamentos = new HashSet<>();

    @OneToMany(mappedBy = "departamentos", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<InventarioDepto> inventarioDepto;

    @OneToMany(mappedBy = "departamentos", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<DeptoImagen> departamentosImagen;

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE,CascadeType.ALL, CascadeType.REFRESH }) 
    @JoinTable(
        name = "departamentos_servicios", 
        joinColumns = @JoinColumn(
            name = "idDepartamentos"), 
            inverseJoinColumns = @JoinColumn(
                name = "idServicios"))
    @JsonIgnore
    private Set<Servicios> servicios = new HashSet<>();

    public Departamentos() {
    }

    public int getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
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

    public String getNombreComunaDepto() {
        return nombreComunaDepto;
    }

    public void setNombreComunaDepto(String nombreComunaDepto) {
        this.nombreComunaDepto = nombreComunaDepto;
    }

    public String getDireccionDepartamento() {
        return direccionDepartamento;
    }

    public void setDireccionDepartamento(String direccionDepartamento) {
        this.direccionDepartamento = direccionDepartamento;
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

    public int getvNoche() {
        return vNoche;
    }

    public void setvNoche(int vNoche) {
        this.vNoche = vNoche;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public String getTipoDepto() {
        return tipoDepto;
    }

    public void setTipoDepto(String tipoDepto) {
        this.tipoDepto = tipoDepto;
    }

    public String getEstadoDepartamento() {
        return estadoDepartamento;
    }

    public void setEstadoDepartamento(String estadoDepartamento) {
        this.estadoDepartamento = estadoDepartamento;
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
