package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tipoDepartamento")
public class TipoDepartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoDepartamento")
    private int idTipoDepartamento;

    @Column(name = "nombreTipo")
    private String nombreTipo;

    @OneToOne(mappedBy = "tipoDepartamento", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private InventarioDepto inventarioDepto;

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(
        name = "departamento_imagen",
        joinColumns = @JoinColumn(
            name = "idTipoDepartamento"),
            inverseJoinColumns = @JoinColumn(
                name = "idImagen"))
    @JsonIgnore
    private Set<TipoDepartamentoImagen> tipoDeptoImagen = new HashSet<>();

    public TipoDepartamento() {
    }

    public int getIdTipoDepartamento() {
        return idTipoDepartamento;
    }

    public void setIdTipoDepartamento(int idTipoDepartamento) {
        this.idTipoDepartamento = idTipoDepartamento;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Set<TipoDepartamentoImagen> getTipoDepartamentoImagen() {
        return tipoDeptoImagen;
    }

    public void setTipoDepartamentoImagen(Set<TipoDepartamentoImagen> tipoDeptoImagen) {
        this.tipoDeptoImagen = tipoDeptoImagen;
    }

    
}
