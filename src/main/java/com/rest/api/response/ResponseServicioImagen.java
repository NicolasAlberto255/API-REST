package com.rest.api.response;

public class ResponseServicioImagen {
    private int idImagen;
    private String nombreImagen;
    private String url;
    private String tipoExtension;
    private long size;
    private int idServicio;

    public ResponseServicioImagen(int idImagen, String nombreImagen, String url, String tipoExtension, long size, int idServicio) {
        this.idImagen = idImagen;
        this.nombreImagen = nombreImagen;
        this.url = url;
        this.tipoExtension = tipoExtension;
        this.size = size;
        this.idServicio = idServicio;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
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

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
}
