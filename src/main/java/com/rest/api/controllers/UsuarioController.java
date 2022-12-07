package com.rest.api.controllers;

import java.util.HashMap;
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
    public List<Usuarios> getUsuario() {
        return usuarioService.getUsuario();
    }

    @GetMapping("usuariosGet/{id}")
    public Usuarios findById(@PathVariable("id") int id) {
        return this.usuarioService.findById(id);
    }

    @GetMapping("cedulaUsuario")
    public List<Usuarios> findUsuarioByCedulaUsuario(@RequestParam String cedulaUsuario) {
        return usuarioService.findUsuarioByCedulaUsuario(cedulaUsuario);
    }

    @GetMapping("estadoUsuario")
    public List<Usuarios> getUsuariosByEstado(@RequestParam String estadoUsuario) {
        return usuarioService.getUsuariosByEstado(estadoUsuario);
    }

    @GetMapping("comunaUsuario")
    public List<Usuarios> getUsuariosByComuna(@RequestParam String comunaUsuario){
        return usuarioService.getUsuariosByComuna(comunaUsuario);
    }

    @GetMapping("regionUsuario")
    public List<Usuarios> getUsuariosByRegion(@RequestParam String regionUsuario){
        return usuarioService.getUsuariosByRegion(regionUsuario);
    }

    @GetMapping("idRol")
    public List<Usuarios> getUsuariosByIdRol(@RequestParam int idRol){
        return usuarioService.getUsuariosByIdRol(idRol);
    }

    @GetMapping("countUsuarios")
    public Object getCountUsuario() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = usuarioService.getCountUsuario();

        map.put("TotalUsuarios", list.get(0));
        return map;
    }

    @GetMapping("countUsuariosByRol")
    public Object getCountUsuariosByRol() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = usuarioService.getCountUsuariosByRol();

        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[0], split[1]);
        }
        return map;
    }

    @GetMapping("countUsuariosByComuna")
    public Object getCountUsuariosByComuna() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = usuarioService.getCountUsuariosByComuna();

        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[0], split[1]);
        }
        return map;
    }

    @GetMapping("countUsuariosByRegion")
    public Object getCountUsuariosByRegion() {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = usuarioService.getCountUsuariosByRegion();

        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[0], split[1]);
        }
        return map;
    }

    @PostMapping("usuariosSave")
    public String saveUsuario(@RequestBody Usuarios usuario) {
        this.usuarioService.saveUsuario(usuario);
        return "Usuario Guardado";
    }

    @PutMapping(path = "usuariosUpdate/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody Usuarios usuario) {
        Usuarios usuarioUpdate = usuarioService.findById(id);
        usuarioUpdate.setNombreUsuario(usuario.getNombreUsuario());
        usuarioUpdate.setApellidoUsuario(usuario.getApellidoUsuario());
        usuarioUpdate.setCorreoUsuario(usuario.getCorreoUsuario());
        usuarioUpdate.setCedulaUsuario(usuario.getCedulaUsuario());
        usuarioUpdate.setTelefonoUsuario(usuario.getTelefonoUsuario());
        usuarioUpdate.setRegionUsuario(usuario.getRegionUsuario());
        usuarioUpdate.setComunaUsuario(usuario.getComunaUsuario());
        usuarioUpdate.setPasswordUsuario(usuario.getPasswordUsuario());
        usuarioUpdate.setEstadoUsuario(usuario.getEstadoUsuario());
        usuarioService.saveUsuario(usuarioUpdate);
        return "Usuario actualizado";
    }

    @DeleteMapping(path = "usuariosDelete/{id}")
    public String deleteUsuario(@PathVariable("id") int id) {
        boolean ok = this.usuarioService.deleteUsuario(id);
        if (ok) {
            return "Usuario eliminado";
        } else {
            return "Error al eliminar usuario";
        }
    }
}