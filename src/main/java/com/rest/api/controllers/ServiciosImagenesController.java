package com.rest.api.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.rest.api.models.Servicios;
import com.rest.api.response.ResponseServicioImagen;
import com.rest.api.response.ResponseMessage;
import com.rest.api.services.ServicioImagenService;

@Controller
@RequestMapping("serviciosImagen/")
public class ServiciosImagenesController {
    @Autowired
    private ServicioImagenService servicioImagenService;

    @GetMapping("imagenList") 
    public ResponseEntity<List<ResponseServicioImagen>> getImagenList(){
        List<ResponseServicioImagen> imagenes = servicioImagenService.getAllFiles().map(imagenFile -> {
            String imagenDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("servicioImagen/downloadImagen/")
                .path(imagenFile.getNombre())
                .toUriString();

            return new ResponseServicioImagen(
                imagenFile.getIdImagen(),
                imagenFile.getNombre(), 
                imagenDownloadUri, 
                imagenFile.getTipo(), 
                imagenFile.getData().length,
                imagenFile.getServicios().getIdServicios());
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(imagenes);
    }

    @GetMapping("downloadImagen/{nombreImagen}")
    public ResponseEntity<?> downloadImagen(@PathVariable String nombreImagen) {
        byte[] imagenData = servicioImagenService.downloadImagen(nombreImagen);
        return ResponseEntity.status(HttpStatus.OK)
                        .contentType(MediaType.valueOf("image/png"))
                        .body(imagenData);
    }

    @GetMapping("imagenesByIdServicio/{idServicio}")
    public ResponseEntity<List<ResponseServicioImagen>> getImagenesByIdDepartamento(@PathVariable int idDepartamento){
        List<ResponseServicioImagen> imagenes = servicioImagenService.getImagenesByIdDepartamento(idDepartamento).stream().map(imagenFile -> {
            String imagenDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("servicioImagen/downloadImagen/")
                .path(imagenFile.getNombre())
                .toUriString();

            return new ResponseServicioImagen(
                imagenFile.getIdImagen(),
                imagenFile.getNombre(), 
                imagenDownloadUri, 
                imagenFile.getTipo(), 
                imagenFile.getData().length,
                imagenFile.getServicios().getIdServicios());
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(imagenes);
    }

    @PostMapping("imagenUpload")
    public ResponseEntity<ResponseMessage> uploadImagen(@RequestParam("imagen") MultipartFile imagen, @RequestParam("idServicios") Servicios idServicios) {
        String message = "";
        
        try { 
            servicioImagenService.uploadImagen(imagen, idServicios);
            
            message = "Imagen subida correctamente: " + imagen.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message)); 
        } catch (Exception e) {
            message = "No se pudo subir la imagen: " + imagen.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @DeleteMapping("imagenDelete/{nombreImagen}")
    public ResponseEntity<ResponseMessage> deleteImagen(@PathVariable String nombreImagen) {
        String message = "";
        
        try { 
            servicioImagenService.deleteImagenByNombre(nombreImagen);
            
            message = "Imagen eliminada correctamente";
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message)); 
        } catch (Exception e) {
            message = "No se pudo eliminar la imagen";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
}
