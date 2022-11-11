package com.rest.api.models;

import javax.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private int idRol;

    @Column(name = "nombreRol")
    private String nombreRol;

    @OneToOne
    @JoinTable(
        name = "usuario", 
        joinColumns = @JoinColumn(
            name = "idRol"), 
            inverseJoinColumns = @JoinColumn(
                name = "idUsuario"))
    private Usuarios idUsuarios;

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRolUsuario() {
        return nombreRol;
    }

    public void setNombreRolUsuario(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}
