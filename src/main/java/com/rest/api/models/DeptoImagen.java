package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "DeptoImagen")
public class DeptoImagen {
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

    @ManyToOne
    @JoinColumn(name = "idDepartamentos")
    private Departamentos departamentos;

    public DeptoImagen() {
    }

    public DeptoImagen(String nombre, String tipo, byte[] data, Departamentos departamentos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.data = data;
        this.departamentos = departamentos;
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

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
}
