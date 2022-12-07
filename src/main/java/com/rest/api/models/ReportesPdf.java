package com.rest.api.models;

import javax.persistence.*;


@Entity
@Table(name = "reportesPdf")
public class ReportesPdf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReporte")
    private int idReporte;

    @Column(name = "nombreReporte")
    private String nombreReporte;

    @Column(name = "tipo")
    private String tipo;

    @Lob
    @Column(name = "data")
    private byte[] data;

    public ReportesPdf() {
    }

    public ReportesPdf(String nombreReporte, String tipo, byte[] data) {
        this.nombreReporte = nombreReporte;
        this.tipo = tipo;
        this.data = data;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
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
}
