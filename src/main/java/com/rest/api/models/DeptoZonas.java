package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "depto_zonas")
public class DeptoZonas {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idDeptoZonas")
    private Integer idDeptoZonas;

    @Column(name = "NombreZona")
    private String nombreZona;

    @Column(name = "gananciaZona")
    private Integer gananciaZona;

    public DeptoZonas() {
    }

    public Integer getIdDeptoZonas() {
        return idDeptoZonas;
    }

    public void setIdDeptoZonas(Integer idDeptoZonas) {
        this.idDeptoZonas = idDeptoZonas;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Integer getGananciaZona() {
        return gananciaZona;
    }

    public void setGananciaZona(Integer gananciaZona) {
        this.gananciaZona = gananciaZona;
    }
    
}
