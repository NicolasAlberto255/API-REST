package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
// @NamedStoredProcedureQuery(name = "usuarios.getUsuariosIdRol",
//     procedureName = "CURSOR_BY_ID", parameters = {
//         @StoredProcedureParameter(mode = ParameterMode.IN,  name = "idRolIn", type = Integer.class),
//         @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "usuarioOutPut", type = String.class)
//     })

@NamedStoredProcedureQuery(name = "usuarios.PostUsuario",
    procedureName = "CREATE_USUARIO", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "idUsuario", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "nombreUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "apellidoUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "emailUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "cedulaUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "telefonoUsuario", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "regionUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "comunaUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "passwordUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "estadoUsuario", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "idRol", type = Integer.class)
    })

@NamedStoredProcedureQuery(name = "usuarios.getUserById",
    procedureName = "GET_USER_BY_ID", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "idUsuarioIn", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "usuarioOut", type = String.class)
    })

@NamedStoredProcedureQuery(name = "usuarios.deleteById",
    procedureName = "DELETE_USER_BY_ID", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "idUsuarioIn", type = Integer.class)
    })
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private int idUsuario;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;

    @Column(name = "apellidoUsuario")
    private String apellidoUsuario;

    @Column(name = "emailUsuario")
    private String emailUsuario;

    @Column(name = "cedulaUsuario")
    private String cedulaUsuario;

    @Column(name = "telefonoUsuario")
    private int telefonoUsuario;

    @Column(name = "regionUsuario")
    private String regionUsuario;

    @Column(name = "comunaUsuario")
    private String comunaUsuario;

    @Column(name = "passwordUsuario")
    private String passwordUsuario;

    @Column(name = "estadoUsuario")
    private String estadoUsuario;

    @ManyToMany(mappedBy = "usuarios")
    @JsonIgnore
    private Set<Reserva> usuarios = new HashSet<>();

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "idRol")
    private Roles rol;

    public Usuarios() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
        return emailUsuario;
    }

    public void setCorreoUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getRegionUsuario() {
        return regionUsuario;
    }

    public void setRegionUsuario(String regionUsuario) {
        this.regionUsuario = regionUsuario;
    }

    public String getComunaUsuario() {
        return comunaUsuario;
    }

    public void setComunaUsuario(String comunaUsuario) {
        this.comunaUsuario = comunaUsuario;
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

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }
}
