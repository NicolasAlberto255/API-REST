package com.rest.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @GetMapping("/")
    public String welcomePage() {

        return "Bienvenido a API-RENT \n <br>" +
                "Los siguientes endpoint son utilizados para crear, guardar, actualizar y eliminar. \n <br> \n <br>" +

                "Departamentos Endpoint \n <br>" +
                "Obtener todos los Departamentos: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/departamentos \n <br>" +
                "Obtener un Departamento por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/departamentosGet/{id} \n <br>" +
                "Guardar un Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/departamentosSave \n <br>" +
                "Añadir un Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/deptoAdd \n <br>" +
                "Actualizar un Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/departamentosUpdate/{id} \n <br>" +
                "Eliminar un Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/departamentosDelete/{id} \n <br>" +
                "Todos los Valores de Noches: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/vNoche \n <br>" +
                "Contar Departamentos por Estado: " + 
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/countDeptoByEstado \n <br>" +
                "Contar Departamentos por Comuna: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/countDeptoByComuna \n <br>" +
                "Contar Departamentos por Region: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/countDeptoByRegion \n <br>" +
                "Contar Departamentos: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/countDepto \n <br>" +
                "Contar Departamentos por Tipo: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/countDeptoByTipo \n <br>" +
                "Estado de Disponibilidad de Departamentos: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/departamentos/estadoDepartamento?estadoDepartamento={estado} \n <br> \n <br>" +

                "Imagenes Departamentos Endpoint \n <br>" +
                "Obtener todas las Imagenes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoImagen/imagenList \n <br>" +
                "Obtener una Imagen por ID Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoImagen/imagenesByIdDepto/{idDepartamento} \n <br>" +
                "Descargar o Mostrar Imagen por nombre de Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoImagen/downloadFile/{nombreImagen} \n <br>" +
                "Guardar una Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoImagen/imagenUpload \n <br>" +
                "Eliminar una Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoImagen/imagenDelete/{nombreImagen} \n <br> \n <br>" +

                "Departamento Servicios Endpoint \n <br>" +
                "Obtener todos los Departamento Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoServicio/deptoServicios \n <br>" +
                "Obtener un Departamento Servicio por ID Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoServicio/deptoServicioByIdDepartamentos?id={id} \n <br>" +
                "Obtener un Departamento Servicio por ID Servicio: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/deptoServicio/deptoServicioByIdServicios?id={id} \n <br> \n <br>" +

                "Reserva Servicios Endpoint \n <br>" +
                "Obtener todas las Reservas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaServicio/reservaServicios \n <br>" +
                "Obtener una Reserva por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaServicio/reservaServicioByIdReserva?id={id} \n <br>" +
                "Obtener una Reserva por ID Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaServicio/reservaServicioByIdServicio?id={id} \n <br> \n <br>" +

                "Reserva Usuario Endpoint \n <br>" +
                "Obtener todas las Reservas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaUsuario/reservaUsuarios \n <br>" +
                "Obtener una Reserva por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaUsuario/reservaUsuarioByIdReserva?id={id} \n <br>" +
                "Obtener una Reserva por ID Usuario: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaUsuario/reservaUsuarioByIdUsuario?id={id} \n <br> \n <br>" +

                "Reserva Departamento Endpoint \n <br>" +
                "Obtener todas las Reservas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaDepartamento/reservaDepartamentos \n <br>" +
                "Obtener una Reserva por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaDepartamento/reservaDepartamentoByIdReserva?id={id} \n <br>" +
                "Obtener una Reserva por ID Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reservaDepartamento/reservaDepartamentoByIdDepartamento?id={id} \n <br> \n <br>" +

                "Servicios Endpoint \n <br>" +
                "Obtener todos los Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/servicios \n <br>" +
                "Obtener los Servicios por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/servicioName?nombreServicios={nombreServicio} \n <br>" +
                "Obtener los Servicios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/serviciosGet/{id} \n <br>" +
                "Guardar Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/serviciosSave \n <br>" +
                "Actualizar Servicios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/actualizarServicios/{id} \n <br>" +
                "Estado de Servicios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicio/disponibilidad?disponibilidadServicios={disponibilidadServicios} \n <br> \n <br>" +

                "Imagenes Servicios Endpoint \n <br>" +
                "Obtener todas las Imagenes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicioImagen/imagenList \n <br>" +
                "Obtener una Imagen por ID Servicio: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicioImagen/imagenesByIdServicio/{idServicio} \n <br>" +
                "Descargar o Mostrar Imagen por nombre de Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicioImagen/downloadFile/{nombreImagen} \n <br>" +
                "Guardar una Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicioImagen/imagenUpload \n <br>" +
                "Eliminar una Imagen: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/servicioImagen/imagenDelete/{nombreImagen} \n <br> \n <br>" +

                "Regiones Endpoint \n <br>" +
                "Obtener todas las Regiones: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/regiones \n <br>" +
                "Obtener las Regiones por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/nombreRegion?nombreRegion={region} \n <br>" +
                "Obtener las Regiones por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/region/{id} \n <br> \n <br>" +

                "Comunas Endpoint \n <br>" +
                "Obtener todas las Comunas: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/comunas \n <br>" +
                "Obtener las Comunas por Nombre: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/nombreComuna?nombreComuna={comuna} \n <br>" +
                "Obtener las Comunas por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/{id} \n <br>" +
                "Obtener las Comunas por ID de Región: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/comuna/comunasByRegionId \n <br> \n <br>" +

                "Usuarios Endpoint \n <br>" +
                "Obtener todos los Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuarios \n <br>" +
                "Obtener los Usuarios por Cedula: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/cedulaUsuario?cedulaUsuario={cedula} \n <br>" +
                "Obtener Usuarios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosGet/{id} \n <br> " +
                "Guardar Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosSave \n <br>" +
                "Actualizar Usuarios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosUpdate/{id} \n <br>" +
                "Obtener los Usuarios por Comuna: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/comunaUsuario?comunaUsuario={comuna} \n <br>" +
                "Obtener los Usuarios por Region: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/regionUsuario?regionUsuario={region} \n <br>" +
                "Obtener los Usuarios por Rol: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/idRol?idRol={idRol} \n <br>" +  
                "Eliminar Usuarios por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/usuariosDelete/{id} \n <br>" +
                "Contar Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/countUsuarios \n <br>" +
                "Contar Usuarios por Rol: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/countUsuariosByRol \n <br>" +
                "Contar Usuarios por Comuna: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/countUsuariosByComuna \n <br>" +
                "Contar Usuarios por Region: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/countUsuariosByRegion \n <br>" +
                "Estado de Usuarios: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/usuario/estadoUsuario?estadoUsuario={estadoUsuario} \n <br> \n <br>" +

                "Roles Endpoint \n <br>" +
                "Obtener todos los Roles: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/rol/roles \n <br>" +
                "Obtener los Roles por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/rol/{id} \n <br>" +
                "Guardar Rol: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/rol/rolSave \n <br>" +
                "Actualizar Rol por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/rol/rolUpdate/{id} \n <br> \n <br>" +

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
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaUpdate/{id} \n <br>" +
                "Eliminar Reserva por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reserva/reservaDelete/{id} \n <br> \n <br>"+

                "Inventario Deparamentos Endpoint \n <br>" +
                "Obtener todos los Inventario Departamentos: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptos \n <br>"+
                "Obtener los Inventario Departamentos por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoGet/{id} \n <br>"+
                "Guardar Inventario Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoSave \n <br>"+
                "Actualizar Inventario Departamento: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoUpdate/{id} \n <br> "+
                "Eliminar Inventario Departamento por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/inventarioDepto/inventarioDeptoDelete/{id} \n <br> \n  <br>"+

                "Reportes Endpoint \n <br>" +
                "Obtener todos los Reportes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/listReportes \n <br>"+
                "Obtener los Reportes por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/{id} \n <br>"+
                "Guardar Reporte: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/reporteSave \n <br>"+
                "Actualizar Reporte: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/reporteUpdate/{id} \n <br>"+
                "Eliminar Reporte por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/reporteDelete/{id} \n <br> \n <br>"+

                "Check In Endpoint \n <br>" +
                "Obtener todos los Check In: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkins \n <br>" +
                "Obtener los Check In por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkinGet/{id} \n <br>" +
                "Guardar Check In: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkinSave \n <br>" +
                "Actualizar Check In por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkInUpdate/{id} \n <br>" +
                "Eliminar Check In por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkin/checkInDelete/{id} \n <br> \n <br>"+

                "Check Out Endpoint \n <br>" +
                "Obtener todos los Check Out: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkouts \n <br>" +
                "Obtener los Check Out por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkoutGet/{id} \n <br>" +
                "Guardar Check Out: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkoutSave \n <br>" +
                "Actualizar Check Out por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkOutUpdate/{id} \n <br>" +
                "Eliminar Check Out por ID: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/checkout/checkOutDelete/{id} \n <br> \n <br>" +

                "Enviar Correo Endpoint \n <br>" +
                "Enviar Correo: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/sendEmail \n <br>" +
                "Enviar Correo con Archivo: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/sendEmailWithAttachment \n <br> \n <br>" +

                "Reporte Endpoint \n <br>" +
                "Obtener todos los Reportes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/reportesList \n <br>" +
                "Subir Reporte: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/reportesUpload \n <br>" +
                "Descargar Reportes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/downloadReporte/{nombreReporte} \n <br>" +
                "Eliminar Reportes: " +
                "http://apirent-env.eba-n7bvnjak.us-east-1.elasticbeanstalk.com/reportes/deleteReporte/{nombreReporte} \n <br> \n <br>";
    }
}
