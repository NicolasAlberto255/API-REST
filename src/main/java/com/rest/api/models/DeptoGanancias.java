package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "depto_ganancias")
public class DeptoGanancias {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idDeptoGanancias")
    private int idDeptoGanancias;

    @Column(name = "gananciaDepto")
    private int gananciaDepto;

    @Column(name = "idDepto")
    private int idDepto;

    @Column(name = "nombreDepartamento")
    private String nombreDepartamento;

    public DeptoGanancias() {
    }

    public int getIdDeptoGanancias() {
        return idDeptoGanancias;
    }

    public void setIdDeptoGanancias(int idDeptoGanancias) {
        this.idDeptoGanancias = idDeptoGanancias;
    }

    public int getGananciaDepto() {
        return gananciaDepto;
    }

    public void setGananciaDepto(int gananciaDepto) {
        this.gananciaDepto = gananciaDepto;
    }

    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}
