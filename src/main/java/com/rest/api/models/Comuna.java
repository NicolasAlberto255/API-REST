package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "comuna")
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComuna")
    private int id;

    @Column(name = "nombreComuna")
    private String nombreComuna;

    @Column(name = "idRegion")
    private int idRegion;

    public Comuna() {
    }

    public Comuna(int id, String nombreComuna, int idRegion) {
        this.id = id;
        this.nombreComuna = nombreComuna;
        this.idRegion = idRegion;
    }

    public int getIdComuna() {
        return id;
    }

    public void setIdComuna(int id) {
        this.id = id;
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
