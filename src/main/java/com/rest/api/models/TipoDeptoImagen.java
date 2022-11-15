package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "tipoDeptoImagen")
public class TipoDeptoImagen {
    @Id
    @Column(name = "idImagen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImagen;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Lob
    @Column(name = "data")
    private byte[] data;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "idTipoDepartamento")
    private TipoDepartamento tipoDepartamento;

    public TipoDeptoImagen() {
    }

    public TipoDeptoImagen(String nombre, String tipo, byte[] data, TipoDepartamento tipoDepartamento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.data = data;
        this.tipoDepartamento = tipoDepartamento;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public TipoDepartamento getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(TipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }
}
