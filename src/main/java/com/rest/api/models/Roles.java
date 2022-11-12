package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private int idRol;

    @Column(name = "nombreRol")
    private String nombreRol;

    @OneToOne(mappedBy = "rol")
    private Usuarios usuarios;

    public Roles() {
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
