package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.models.*;
import com.rest.api.repositories.RolesRepository;
import com.rest.api.repositories.UsuariosRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuarioRepository;

    @Autowired
    RolesRepository rolRepository;

    public List<Usuarios> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public void postUsuario(Usuarios usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuarios findById(int idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    public String getUserById(int idUsuarioIn) {
        return usuarioRepository.getUserById(idUsuarioIn);
    }

    public List<Usuarios> findUsuarioByCedulaUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByCedulaUsuario(nombreUsuario);
    }

    public Optional<Usuarios> idProcedure(int idRolIn) {
        return usuarioRepository.idProcedure(idRolIn);
    }

    public boolean deleteById(int idUsuarioIn) {
        try {
            usuarioRepository.deleteById(idUsuarioIn);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
