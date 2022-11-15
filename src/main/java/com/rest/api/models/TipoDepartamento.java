package com.rest.api.models;

import java.util.Set;
import javax.persistence.*;

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

    @OneToMany(mappedBy = "tipoDepartamento", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<TipoDeptoImagen> tipoDeptoImagen;

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
    
}
