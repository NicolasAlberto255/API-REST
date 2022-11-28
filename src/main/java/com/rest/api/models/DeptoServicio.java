package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "depto_servicio")
public class DeptoServicio {
    @Id
    @GeneratedValue
    private int idDeptoServicio;

    private int idDepartamentos;

    private int idServicios;

    public DeptoServicio() {
    }

    public int getIdDeptoServicio() {
        return idDeptoServicio;
    }

    public void setIdDeptoServicio(int idDeptoServicio) {
        this.idDeptoServicio = idDeptoServicio;
    }

    public int getIdDepartamento() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public int getIdServicio() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }
}
