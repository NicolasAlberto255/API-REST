package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.Usuarios;
import com.rest.api.repositories.UsuariosRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuarioRepository;

    public ArrayList<Usuarios> getUsuario() {
        return (ArrayList<Usuarios>) usuarioRepository.findAll();
    }

    public Usuarios saveUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuarios findById(int id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuarios> findUsuarioByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByNombreUsuario(nombreUsuario);
    }

    public List<Usuarios> findUsuarioByApellidoUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByApellidoUsuario(nombreUsuario);
    }

    public List<Usuarios> findUsuarioByCedulaUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByCedulaUsuario(nombreUsuario);
    }

    public boolean deleteUsuario(Integer id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
