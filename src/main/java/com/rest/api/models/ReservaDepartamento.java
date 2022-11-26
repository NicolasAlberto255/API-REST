package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "reserva_departamentos")
public class ReservaDepartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservaDepartamentos")
    private int idReservaDepartamentos;

    @Column(name = "idReserva")
    private int idReserva;

    @Column(name = "idDepartamentos")
    private int idDepartamentos;

    public ReservaDepartamento() {
    }

    public int getIdReservaDepartamentos() {
        return idReservaDepartamentos;
    }

    public void setIdReservaDepartamentos(int idReservaDepartamentos) {
        this.idReservaDepartamentos = idReservaDepartamentos;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }
}
