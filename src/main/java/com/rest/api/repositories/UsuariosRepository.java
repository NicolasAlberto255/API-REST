package com.rest.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rest.api.models.Roles;
import com.rest.api.models.Usuarios;

@Repository
@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findUsuarioByCedulaUsuario(String cedulaUsuario);

    public Usuarios findById(int idUsuario);
    
    // @Procedure(procedureName = "CURSOR_BY_ID", outputParameterName = "usuarioOutPut")
    // public Optional<Usuarios> idProcedure(@Param("idRolIn") int idRolIn);

    @Procedure(name = "usuarios.getUsuariosIdRol", outputParameterName = "usuarioOutPut")
    Optional<Usuarios> idProcedure(int idRolIn);

    @Procedure(name = "usuarios.deleteById")
    public void deleteById(int idUsuarioIn);

    @Procedure(name = "usuarios.getUserById", outputParameterName = "usuarioOut")
    String getUserById(int idUsuarioIn);

    @Procedure(name = "usuarios.PostUsuario")
    void postUsuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario,
            String cedulaUsuario, int telefonoUsuario, String regionUsuario, String comunaUsuario,
            String passwordUsuario, String estadoUsuario, Roles idRol);
}

