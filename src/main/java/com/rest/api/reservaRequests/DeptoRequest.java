package com.rest.api.reservaRequests;

import java.util.Set;
import com.rest.api.models.*;

public class DeptoRequest {
        
        public int id;
        public String nombreDepartamento;
        public String nombreRegionDepto;
        public String nombreComunaDepto;
        public String direccionDepartamento;
        public int nEdificio;
        public int nDepto;
        public int nHabitacion;
        public int nBanos;
        public int vNoche;
        public Boolean balcon;
        public String tipoDepto;
        public String estadoDepartamento;
        public Set<Servicios> servicios;
}
