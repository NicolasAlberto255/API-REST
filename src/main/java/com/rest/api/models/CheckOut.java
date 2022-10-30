package com.rest.api.models;

import java.sql.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "checkOut")
public class CheckOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCheckOut")
    private int id;

    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name = "fechaCheckOut")
    private Date fechaCheckOut;

    @Column(name = "estadoDepartamento")
    private String estadoDepartamento;

    @Column(name = "pagoCostoReparaciones")
    private Integer pagoCostoReparaciones;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "idCheckIn")
    private CheckIn checkIn;

    public CheckOut() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Integer getPagoCostoReparaciones() {
        return pagoCostoReparaciones;
    }

    public void setPagoCostoReparaciones(Integer pagoCostoReparaciones) {
        this.pagoCostoReparaciones = pagoCostoReparaciones;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }
}
