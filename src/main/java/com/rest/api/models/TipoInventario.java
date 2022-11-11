package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "tipoInventario")
public class TipoInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoInventario")
    private Integer id;

    @Column(name = "nombreTipo")
    private String nombreTipo;

    @OneToOne(mappedBy = "tipoInventario", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private InventarioDepto inventarioDepto;

    public TipoInventario() {
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
