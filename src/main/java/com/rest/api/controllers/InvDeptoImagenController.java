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
import com.rest.api.models.InventarioDepto;
import com.rest.api.response.ResponseInvDeptoImagen;
import com.rest.api.response.ResponseMessage;
import com.rest.api.services.InvDeptoImagenService;

@Controller
@RequestMapping("invDeptoImagen/")
public class InvDeptoImagenController {
    @Autowired
    private InvDeptoImagenService invDeptoImagenService;

    @GetMapping("imagenList") 
    public ResponseEntity<List<ResponseInvDeptoImagen>> getImagenList(){
        List<ResponseInvDeptoImagen> imagenes = invDeptoImagenService.getAllFiles().map(imagenFile -> {
            String imagenDownloadUri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("deptoImagen/downloadImagen/")
                .path(imagenFile.getNombre())
                .toUriString();

            return new ResponseInvDeptoImagen(
                imagenFile.getIdImagen(),
                imagenFile.getNombre(), 
                imagenDownloadUri, 
                imagenFile.getTipo(), 
                imagenFile.getData().length,
                imagenFile.getInventarioDepto().getIdInventarioDepto());
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(imagenes);
    }

    @GetMapping("downloadImagen/{nombreImagen}")
    public ResponseEntity<?> downloadImagen(@PathVariable String nombreImagen) {
        byte[] imagenData = invDeptoImagenService.downloadImagen(nombreImagen);
        return ResponseEntity.status(HttpStatus.OK)
                        .contentType(MediaType.valueOf("image/png"))
                        .body(imagenData);
    }

    @PostMapping("imagenUpload")
    public ResponseEntity<ResponseMessage> uploadImagen(@RequestParam("imagen") MultipartFile imagen, @RequestParam("idDepartamentos") InventarioDepto idInventarioDepto) {
        String message = "";
        
        try { 
            invDeptoImagenService.uploadImagen(imagen, idInventarioDepto);
            
            message = "Imagen subida correctamente: " + imagen.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message)); 
        } catch (Exception e) {
            message = "No se pudo subir la imagen: " + imagen.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
}
