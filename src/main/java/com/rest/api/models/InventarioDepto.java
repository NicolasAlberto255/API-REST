package com.rest.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "inventarioDepto")
public class InventarioDepto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventarioDepto")
    private int idInventarioDepto;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idTipoDepartamento")
    private TipoDepartamento tipoDepartamento;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idDepartamentos")
    private Departamentos departamentos;

    @OneToMany(mappedBy = "inventarioDepto", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    private Set<InvDeptoImagen> invDeptoImagen;

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

    public TipoDepartamento getTipoDepartament() {
        return tipoDepartamento;
    }

    public void setTipoDepartament(TipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

}
