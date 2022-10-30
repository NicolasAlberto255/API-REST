package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private int id;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;

    @Column(name = "apellidoUsuario")
    private String apellidoUsuario;

    @Column(name = "emailUsuario")
    private String correoUsuario;

    @Column(name = "cedulaUsuario")
    private String cedulaUsuario;

    @Column(name = "telefonoUsuario")
    private int telefonoUsuario;

    @Column(name = "passwordUsuario")
    private String passwordUsuario;

    @Column(name = "rolUsuario")
    private String rolUsuario;

    @ManyToMany(mappedBy = "usuarios")
    @JsonIgnore
    private Set<Reserva> usuarios = new HashSet<>();

    public Usuarios() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public Integer getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(Integer telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public Set<Reserva> getReservas() {
        return usuarios;
    }

    public void setReservas(Set<Reserva> usuarios) {
        this.usuarios = usuarios;
    }

    public void addReservas(Reserva reserva) {
        this.usuarios.add(reserva);
    }
}
