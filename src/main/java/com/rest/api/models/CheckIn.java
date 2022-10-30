package com.rest.api.models;

import java.sql.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "checkIn")
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCheckIn")
    private int id;

    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name = "fechaCheckIn")
    private Date fechaCheckIn;

    @Column(name = "montoFinalReserva")
    private Integer montoFinalReserva;

    @Column(name = "Anotaciones")
    private String anotaciones;

    @OneToOne(mappedBy = "checkIn")
    private CheckOut checkOut;

    public CheckIn() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public Integer getMontoFinalReserva() {
        return montoFinalReserva;
    }

    public void setMontoFinalReserva(Integer montoFinalReserva) {
        this.montoFinalReserva = montoFinalReserva;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
}
