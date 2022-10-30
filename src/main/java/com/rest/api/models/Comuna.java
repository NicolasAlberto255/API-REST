package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "comuna")
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComuna")
    private int idComuna;

    @Column(name = "nombreComuna")
    private String nombreComuna;

    @Column(name = "idRegion")
    private int idRegion;

    public Comuna() {
    }

    public Comuna(int idComuna, String nombreComuna, int idRegion) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.idRegion = idRegion;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

}
