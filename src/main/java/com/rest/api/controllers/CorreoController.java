package com.rest.api.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.rest.api.models.Correo;
import com.rest.api.models.CorreoAttachment;
import com.rest.api.services.CorreoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CorreoController {
    
    @Autowired
    CorreoService correoService;

    @PostMapping("sendEmail")
    public String sendCorreo(@RequestBody Correo correo){
        correoService.sendEmail(correo);
        return "Correo enviado Correctamente";
    }

    @PostMapping("sendEmailWithAttachment")
    public String sendEmailWithAttachment(@RequestBody CorreoAttachment correoAttachment) throws MessagingException{
        correoService.sendEmailWithAttachment(correoAttachment);
        return "Correo enviado Correctamente";
    }
}
