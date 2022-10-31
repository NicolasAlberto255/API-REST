package com.rest.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @GetMapping("/")
    public String welcomePage() {

        return "Bienvenido a API-RENT \n <br>" +
                "Los siguientes endpoint son utilizados para crear, guardar, actualizar y eliminar. \n <br> \n <br>" +

                "Servicios Endpoint \n <br>" +
                "Obtener todos los Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicios/serviciosGet \n <br>" +
                "Obtener los Servicios por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicios/serviciosName \n <br>" +
                "Obtener los Servicios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicios/serviciosGet/{id} \n <br>" +
                "Guardar Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicios/serviciosSave \n <br> \n <br>"
                +

                "Regiones Endpoint \n <br>" +
                "Obtener todas las Regiones: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/regiones \n <br>" +
                "Obtener las Regiones por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/nombreRegion \n <br>" +
                "Obtener las Regiones por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/{id} \n <br> \n <br>" +

                "Comunas Endpoint \n <br>" +
                "Obtener todas las Comunas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/comunas \n <br>" +
                "Obtener las Comunas por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/nombreComuna \n <br>" +
                "Obtener las Comunas por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/{id} \n <br>" +
                "Obtener las Comunas por ID de Región: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/comunasByRegionId \n <br> \n <br>"
                +

                "Provincias Endpioint \n <br>" +
                "Obtener todas las Provincias: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/provincia/provincias \n <br>" +
                "Obtener las Provincias por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/provincia/nombreProvincia \n <br>" +
                "Obtener las Provincias por ID:" +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/provincia/{id} \n <br>" +
                "Obtener las Provincias por ID de Región: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/provincia/provinciasByRegionId \n <br>"
                +
                "Obtener las Provincias por ID de Comuna: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/provincia/provinciasByComunaId \n <br> \n <br>"
                +

                "Usuarios Endpoint \n <br>" +
                "Obtener todos los Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuarios \n <br>" +
                "Obtener los Usuarios por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/nombreUsuario \n <br>" +
                "Obtener los Usuarios por Apellido: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/apellidoUsuario \n <br>" +
                "Obtener los Usuarios por Cedula: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/cedulaUsuario \n <br>" +
                "Obtener Usuarios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosGet/{id} \n <br> " +
                "Guardar Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosSave \n <br>" +
                "Actualizar Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosPut/{id} \n <br> \n <br>"
                +

                "Tipo Inventario Endpoint \n <br>" +
                "Obtener todos los Tipos de Inventario: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/tipoInventario/tipoInventarios \n <br>"
                +
                "Obtener los Tipos de Inventario por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/tipoInventario/tipoInventarioGet/{id} \n <br>"
                +
                "Guardar Tipo de Inventario: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/tipoInventario/tipoInventarioSave \n <br>"
                +
                "Actualizar Tipo de Inventario: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/tipoInventario/tipoInventarioPut/{id} \n <br>"
                +
                "Eliminar Tipo de Inventario por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/tipoInventario/tipoInventarioDelete/{id} \n <br> \n <br>"
                +

                "Reservas Endpoint \n <br>" +
                "Obtener todas las Reservas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservas \n <br>" +
                "Obtener las Reservas por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaGet/{id} \n <br>" +
                "Guardar Reserva: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaSave \n <br>" +
                "Añadir Reserva con Datos de Usuario y Servicio: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaAdd \n <br>" +
                "Actualizar Reserva: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaPut/{id} \n <br>" +
                "Eliminar Reserva por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaDelete/{id} \n <br> \n <br>"
                +

                "Inventario Deparamentos Endpoint \n <br>" +
                "Obtener todos los Inventario Departamentos: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptos \n <br>"
                +
                "Obtener los Inventario Departamentos por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoGet/{id} \n <br>"
                +
                "Guardar Inventario Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoSave \n <br>"
                +
                "Actualizar Inventario Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoPut/{id} \n <br> "
                +
                "Eliminar Inventario Departamento por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoDelete/{id} \n <br> \n  <br>"
                +

                "Check In Endpoint \n <br>" +
                "Obtener todos los Check In: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkins \n <br>" +
                "Obtener los Check In por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkinGet/{id} \n <br>" +
                "Guardar Check In: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkinSave \n <br>" +
                "Actualizar Check In por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkinPut/{id} \n <br> \n <br>"
                +

                "Check Out Endpoint \n <br>" +
                "Obtener todos los Check Out: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkouts \n <br>" +
                "Obtener los Check Out por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkoutGet/{id} \n <br>" +
                "Guardar Check Out: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkoutSave \n <br>" +
                "Actualizar Check Out por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkoutPut/{id} \n <br> \n <br>";
    }
}
