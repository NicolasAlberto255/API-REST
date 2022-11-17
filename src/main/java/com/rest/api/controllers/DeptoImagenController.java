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
import com.rest.api.models.Departamentos;
import com.rest.api.response.ResponseDeptoImagen;
import com.rest.api.response.ResponseMessage;
import com.rest.api.services.DeptoImagenService;

@Controller 
@RequestMapping("deptoImagen/")
public class DeptoImagenController {

    @Autowired
    private DeptoImagenService deptoImagenService;

    @GetMapping("imagenList") 
    public ResponseEntity<List<ResponseDeptoImagen>> getImagenList(){
        List<ResponseDeptoImagen> imagenes = deptoImagenService.getAllFiles().map(imagenFile -> {
            String imagenDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("deptoImagen/downloadImagen/")
                .path(imagenFile.getNombre())
                .toUriString();

            return new ResponseDeptoImagen(
                imagenFile.getIdImagen(),
                imagenFile.getNombre(), 
                imagenDownloadUri, 
                imagenFile.getTipo(), 
                imagenFile.getData().length,
                imagenFile.getDepartamentos().getIdDepartamentos());
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(imagenes);
    }

    @GetMapping("downloadImagen/{nombreImagen}")
    public ResponseEntity<?> downloadImagen(@PathVariable String nombreImagen) {
        byte[] imagenData = deptoImagenService.downloadImagen(nombreImagen);
        return ResponseEntity.status(HttpStatus.OK)
                        .contentType(MediaType.valueOf("image/png"))
                        .body(imagenData);
    }

    @PostMapping("imagenUpload")
    public ResponseEntity<ResponseMessage> uploadImagen(@RequestParam("imagen") MultipartFile imagen, @RequestParam("idDepartamentos") Departamentos idDepartamentos) {
        String message = "";
        
        try { 
            deptoImagenService.uploadImagen(imagen, idDepartamentos);
            
            message = "Imagen subida correctamente: " + imagen.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message)); 
        } catch (Exception e) {
            message = "No se pudo subir la imagen: " + imagen.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
}
