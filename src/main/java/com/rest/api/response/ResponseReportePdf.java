package com.rest.api.response;

public class ResponseReportePdf {
    private int idReporte;
    private String nombreReporte;
    private String url;
    private String tipoExtension;
    private long size;

    public ResponseReportePdf(int idReporte, String nombreReporte, String url, String tipoExtension, long size) {
        this.idReporte = idReporte;
        this.nombreReporte = nombreReporte;
        this.url = url;
        this.tipoExtension = tipoExtension;
        this.size = size;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipoExtension() {
        return tipoExtension;
    }

    public void setTipoExtension(String tipoExtension) {
        this.tipoExtension = tipoExtension;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
