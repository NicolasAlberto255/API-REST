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
import com.rest.api.response.ResponseImagen;
import com.rest.api.response.ResponseMessage;
import com.rest.api.services.TipoDepartamentoImagenService;

@Controller
@RequestMapping("tipoDepartamentoImagen/")
public class TipoDepartamentoImagenController {

    @Autowired
    private TipoDepartamentoImagenService tipoDepartamentoImagenService;

    @PostMapping("imagenUpload")
    public ResponseEntity<ResponseMessage> uploadImagen(@RequestParam("imagen") MultipartFile imagen) {
        String message = "";

        try { 
            tipoDepartamentoImagenService.uploadImagen(imagen);

            message = "Imagen subida correctamente: " + imagen.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message)); 
        } catch (Exception e) {
            message = "No se pudo subir la imagen: " + imagen.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping("imagenList") 
    public ResponseEntity<List<ResponseImagen>> getImagenList(){
        List<ResponseImagen> imagenes = tipoDepartamentoImagenService.getAllFiles().map(imagenFile -> {
            String imagenDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("tipoDepartamentoImagen/downloadImagen/")
                .path(imagenFile.getNombre())
                .toUriString();

            return new ResponseImagen(
                imagenFile.getNombre(), 
                imagenDownloadUri, 
                imagenFile.getTipo(), 
                imagenFile.getData().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(imagenes);
    }

    @GetMapping("downloadImagen/{nombreImagen}")
    public ResponseEntity<?> downloadImagen(@PathVariable String nombreImagen) {
        byte[] imagenData = tipoDepartamentoImagenService.downloadImagen(nombreImagen);
        return ResponseEntity.status(HttpStatus.OK)
                        .contentType(MediaType.valueOf("image/png"))
                        .body(imagenData);
    }
}
