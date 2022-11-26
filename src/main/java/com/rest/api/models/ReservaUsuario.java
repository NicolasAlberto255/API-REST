package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "reserva_usuario")
public class ReservaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservaUsuario")
    private int idReservaUsuario;

    @Column(name = "idReserva")
    private int idReserva;
    
    @Column(name = "idUsuario")
    private int idUsuario;

    public ReservaUsuario() {
    }

    public int getIdReservaUsuario() {
        return idReservaUsuario;
    }

    public void setIdReservaUsuario(int idReservaUsuario) {
        this.idReservaUsuario = idReservaUsuario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }    
}
