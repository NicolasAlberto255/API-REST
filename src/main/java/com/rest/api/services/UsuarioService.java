package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.*;
import com.rest.api.repositories.RolesRepository;
import com.rest.api.repositories.UsuariosRepository;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuarioRepository;

    @Autowired
    RolesRepository rolRepository;

    public List<Usuarios> getUsuario() {
        return (List<Usuarios>) usuarioRepository.findAll();
    }

    public Usuarios saveUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuarios findById(int id) {
        return usuarioRepository.findById(id);
    }

    public List<String> getCountUsuario() {
        return usuarioRepository.getCountUsuarios();
    }

    public List<String> getCountUsuariosByRol() {
        return usuarioRepository.getCountUsuariosByRol();
    }

    public List<String> getCountUsuariosByComuna() {
        return usuarioRepository.getCountUsuariosByComuna();
    }

    public List<String> getCountUsuariosByRegion() {
        return usuarioRepository.getCountUsuariosByRegion();
    }

    public List<Usuarios> findUsuarioByCedulaUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByCedulaUsuario(nombreUsuario);
    }

    public List<Usuarios> getUsuariosByEstado(String estadoUsuario) {
        return usuarioRepository.getUsuariosByEstado(estadoUsuario);
    }

    public List<Usuarios> getUsuariosByComuna(String comunaUsuario) {
        return usuarioRepository.getUsuariosByComuna(comunaUsuario);
    }

    public List<Usuarios> getUsuariosByRegion(String rolUsuario) {
        return usuarioRepository.getUsuariosByRegion(rolUsuario);
    }

    public List<Usuarios> getUsuariosByIdRol(int idRol) {
        return usuarioRepository.getUsuariosByIdRol(idRol);
    }

    public boolean deleteUsuario(int id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
