package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "depto_zonas")
@NamedStoredProcedureQuery(name = "zonas.postZona",
        procedureName = "INSERT_DEPTO_ZONAS",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "idDeptoZonas", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "nombreZona", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "gananciaZona", type = Integer.class)
        })

@NamedStoredProcedureQuery(name = "zonas.updateZona",
        procedureName = "UPDATE_DEPTO_ZONAS",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "idDeptoZonas", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "gananciaZona", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "nombreZona", type = String.class)
        })
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
