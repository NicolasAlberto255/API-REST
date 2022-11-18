package com.rest.api.response;

public class ResponseInvDeptoImagen {
    private int idImagen;
    private String nombreImagen;
    private String url;
    private String tipoExtension;
    private long size;
    private int idInventarioDepto;

    public ResponseInvDeptoImagen(int idImagen, String nombreImagen, String url, String tipoExtension, long size, int idInventarioDepto) {
        this.idImagen = idImagen;
        this.nombreImagen = nombreImagen;
        this.url = url;
        this.tipoExtension = tipoExtension;
        this.size = size;
        this.idInventarioDepto = idInventarioDepto;
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

    public int getIdInventarioDepto() {
        return idInventarioDepto;
    }

    public void setIdInventarioDepto(int idInventarioDepto) {
        this.idInventarioDepto = idInventarioDepto;
    }
}
