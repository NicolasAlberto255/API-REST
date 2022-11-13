package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "tipoDepartamento")
public class TipoDepartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoDepartamento")
    private Integer id;

    @Column(name = "nombreTipo")
    private String nombreTipo;

    @OneToOne(mappedBy = "tipoDepartamento", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private InventarioDepto inventarioDepto;

    public TipoDepartamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
