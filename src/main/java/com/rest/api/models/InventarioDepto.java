package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "inventarioDepto")
public class InventarioDepto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventarioDepto")
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idTipoInventario")
    private TipoInventario tipoInventario;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idDepartamentos")
    private Departamentos departamentos;

    public InventarioDepto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public TipoInventario getTipoInventario() {
        return tipoInventario;
    }

    public void setTipoInventario(TipoInventario tipoInventario) {
        this.tipoInventario = tipoInventario;
    }

}
