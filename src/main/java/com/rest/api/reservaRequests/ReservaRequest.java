package com.rest.api.reservaRequests;

import java.sql.Date;
import java.util.Set;

import com.rest.api.models.*;

public class ReservaRequest {

    public int id;
    public Date fechaInicio;
    public Date fechaFin;
    public Date fechaCreacion;
    public int precioAbono;
    public Set<Servicios> servicios;
    public Set<Departamentos> departamentos;
    public Set<Usuarios> usuarios;
}
