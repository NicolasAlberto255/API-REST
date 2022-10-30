package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "provincia")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProvincia")
    private int idProvincia;

    @Column(name = "idRegion")
    private int idRegion;

    @Column(name = "nombreProvincia")
    private String nombreProvincia;

    public Provincia() {
    }

    public Provincia(int idProvincia, int idRegion, String nombreProvincia) {
        this.idProvincia = idProvincia;
        this.idRegion = idRegion;
        this.nombreProvincia = nombreProvincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
}
