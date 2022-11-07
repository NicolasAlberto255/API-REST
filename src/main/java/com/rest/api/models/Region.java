package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegion")
    private int id;

    @Column(name = "nombreRegion")
    private String nombreRegion;

    public Region() {
    }

    public Region(int id, String nombreRegion) {
        this.id = id;
        this.nombreRegion = nombreRegion;
    }

    public int getIdRegion() {
        return id;
    }

    public void setIdRegion(int id) {
        this.id = id;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
}
