package com.rest.api.models;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "checkOut")
public class CheckOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCheckOut")
    private int idCheckOut;

    @Column(name = "fechaCheckOut")
    private Date fechaCheckOut;

    @Column(name = "estadoDepartamento")
    private String estadoDepartamento;

    @Column(name = "pagoCostoReparaciones")
    private int pagoCostoReparaciones;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "idCheckIn")
    private CheckIn checkIn;

    public CheckOut() {
    }

    public int getIdCheckOut() {
        return idCheckOut;
    }

    public void setIdCheckOut(int idCheckOut) {
        this.idCheckOut = idCheckOut;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public String getEstadoDepartamento() {
        return estadoDepartamento;
    }

    public void setEstadoDepartamento(String estadoDepartamento) {
        this.estadoDepartamento = estadoDepartamento;
    }

    public int getPagoCostoReparaciones() {
        return pagoCostoReparaciones;
    }

    public void setPagoCostoReparaciones(int pagoCostoReparaciones) {
        this.pagoCostoReparaciones = pagoCostoReparaciones;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }
}
