package com.rest.api.response;

public class ResponseTipoDeptoImagen {
    private int idImagen;
    private String nombreImagen;
    private String url;
    private String tipoExtension;
    private long size;
    private int idTipoDepto;

    public ResponseTipoDeptoImagen(int idImagen, String nombreImagen, String url, String tipoExtension, long size, int idTipoDepto) {
        this.idImagen = idImagen;
        this.nombreImagen = nombreImagen;
        this.url = url;
        this.tipoExtension = tipoExtension;
        this.size = size;
        this.idTipoDepto = idTipoDepto;
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

    public int getIdTipoDepto() {
        return idTipoDepto;
    }

    public void setIdTipoDepto(int idTipoDepto) {
        this.idTipoDepto = idTipoDepto;
    }
}