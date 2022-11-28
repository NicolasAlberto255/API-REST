package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "reserva_servicios")
public class ReservaServicio {
    @Id
    @GeneratedValue
    private int idReservaServicio;

    private int idReserva;

    private int idServicios;

    public ReservaServicio() {
    }

    public int getIdReservaServicio() {
        return idReservaServicio;
    }

    public void setIdReservaServicio(int idReservaServicio) {
        this.idReservaServicio = idReservaServicio;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }
}
