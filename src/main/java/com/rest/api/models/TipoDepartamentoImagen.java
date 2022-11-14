package com.rest.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tipoDepartamentoImagen")
public class TipoDepartamentoImagen {
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

    @ManyToMany(mappedBy = "tipoDeptoImagen")
    @JsonIgnore
    private Set<TipoDepartamento> tipoDepartamentoImagen = new HashSet<>();

    public TipoDepartamentoImagen() {
    }

    public TipoDepartamentoImagen(String nombre, String tipo, byte[] data) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.data = data;
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

    public Set<TipoDepartamento> getTipoDepartamentoImagen() {
        return tipoDepartamentoImagen;
    }

    public void setIdTipoDepartamento(Set<TipoDepartamento> tipoDepartamentoImagen) {
        this.tipoDepartamentoImagen = tipoDepartamentoImagen;
    }

    public void addTipoDepartamento(TipoDepartamento tipoDepartamentoImagen) {
        this.tipoDepartamentoImagen.add(tipoDepartamentoImagen);
    }
}
