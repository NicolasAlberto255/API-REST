package com.rest.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
    public List<Usuarios> listarUsuarios() {
         return usuarioService.listarUsuarios();
    }
    
    @Transactional
    @GetMapping("usuarioId/{idUsuarioIn}")
    public String getUserById(@PathVariable("idUsuarioIn") int idUsuarioIn) {
        return usuarioService.getUserById(idUsuarioIn);
    }

    @Transactional
    @GetMapping("usuariosGetProcedure/{id}")
    public Optional<Usuarios> idProcedure(@PathVariable("id") int idRolIn) {
        return usuarioService.idProcedure(idRolIn);
    }
   
    @GetMapping("cedulaUsuario")
    public List<Usuarios> findUsuarioByCedulaUsuario(@RequestParam String cedulaUsuario) {
        return usuarioService.findUsuarioByCedulaUsuario(cedulaUsuario);
    }

    @PostMapping("usuariosSave")
    public void postUsuario(@RequestBody Usuarios usuario) {
        usuarioService.postUsuario(usuario);
    }

    @PutMapping("usuariosUpdate/{id}")
    public String updateUser(@PathVariable("id") int idUsuario, @RequestBody Usuarios usuario) {
        Usuarios usuarioUpdate = usuarioService.findById(idUsuario);
        usuarioUpdate.setNombreUsuario(usuario.getNombreUsuario());
        usuarioUpdate.setApellidoUsuario(usuario.getApellidoUsuario());
        usuarioUpdate.setCorreoUsuario(usuario.getCorreoUsuario());
        usuarioUpdate.setCedulaUsuario(usuario.getCedulaUsuario());
        usuarioUpdate.setTelefonoUsuario(usuario.getTelefonoUsuario());
        usuarioUpdate.setRegionUsuario(usuario.getRegionUsuario());
        usuarioUpdate.setComunaUsuario(usuario.getComunaUsuario());
        usuarioUpdate.setPasswordUsuario(usuario.getPasswordUsuario());
        usuarioUpdate.setEstadoUsuario(usuario.getEstadoUsuario());
        usuarioService.postUsuario(usuarioUpdate);
        return "Usuario actualizado";
    }

    @DeleteMapping("usuariosDelete/{idUsuarioIn}")
    public String deleteById(@PathVariable("idUsuarioIn") int idUsuarioIn) {
        boolean ok = this.usuarioService.deleteById(idUsuarioIn);
        if (ok) {
            return "Usuario eliminado";
        } else {
            return "Error al eliminar usuario";
        }
    }
}