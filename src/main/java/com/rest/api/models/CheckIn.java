package com.rest.api.models;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "checkIn")
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCheckIn")
    private int idCheckIn;

    @Column(name = "fechaCheckIn")
    private Date fechaCheckIn;

    @Column(name = "montoFinalReserva")
    private int montoFinalReserva;

    @Column(name = "Anotaciones")
    private String anotaciones;

    @Column(name = "nombreCliente")
    private String nombreCliente;

    @OneToOne(mappedBy = "checkIn")
    private CheckOut checkOut;

    public CheckIn() {
    }

    public int getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(int idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public int getMontoFinalReserva() {
        return montoFinalReserva;
    }

    public void setMontoFinalReserva(int montoFinalReserva) {
        this.montoFinalReserva = montoFinalReserva;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
