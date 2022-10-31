package com.rest.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.models.Usuarios;
import com.rest.api.services.UsuarioService;

@RestController
@RequestMapping("usuario/")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("usuarios")
    public ArrayList<Usuarios> getUsuario() {
        return usuarioService.getUsuario();
    }

    @GetMapping("usuariosGet/{id}")
    public Usuarios findById(@PathVariable("id") Integer id) {
        return this.usuarioService.findById(id);
    }

    @GetMapping("nombreUsuario")
    public List<Usuarios> getUsuarioByNombreUsuario(@RequestParam String nombreUsuario) {
        return usuarioService.findUsuarioByNombreUsuario(nombreUsuario);
    }

    @GetMapping("apellidoUsuario")
    public List<Usuarios> getUsuarioByApellidoUsuario(@RequestParam String apellidoUsuario) {
        return usuarioService.findUsuarioByApellidoUsuario(apellidoUsuario);
    }

    @GetMapping("cedulaUsuario")
    public List<Usuarios> getUsuarioByCedulaUsuario(@RequestParam String cedulaUsuario) {
        return usuarioService.findUsuarioByCedulaUsuario(cedulaUsuario);
    }

    @PostMapping("usuariosSave")
    public String saveUsuario(@RequestBody Usuarios usuario) {
        this.usuarioService.saveUsuario(usuario);
        return "Usuario Guardado";
    }

    @PutMapping(path = "usuariosPut/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody Usuarios usuario) {
        Usuarios usuarioUpdate = usuarioService.findById(id);
        usuarioUpdate.setNombreUsuario(usuario.getNombreUsuario());
        usuarioUpdate.setApellidoUsuario(usuario.getApellidoUsuario());
        usuarioUpdate.setCorreoUsuario(usuario.getCorreoUsuario());
        usuarioUpdate.setCedulaUsuario(usuario.getCedulaUsuario());
        usuarioUpdate.setTelefonoUsuario(usuario.getTelefonoUsuario());
        usuarioUpdate.setPasswordUsuario(usuario.getPasswordUsuario());
        usuarioService.saveUsuario(usuarioUpdate);
        return "Usuario actualizado";
    }
}