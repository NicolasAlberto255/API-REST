package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "inventarioDepto")
public class InventarioDepto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventarioDepto")
    private int idInventarioDepto;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "idTipoDepartamento")
    private TipoDepartamento tipoDepartamento;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "idDepartamentos")
    private Departamentos departamentos;

    public InventarioDepto() {
    }

    public int getIdInventarioDepto() {
        return idInventarioDepto;
    }

    public void setIdInventarioDepto(int idInventarioDepto) {
        this.idInventarioDepto = idInventarioDepto;
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

    public TipoDepartamento getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartament(TipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

}
