package com.rest.api.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Usuarios;

@Repository
@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findUsuarioByCedulaUsuario(String cedulaUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE COMUNA_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByComuna(String comunaUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE REGION_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByRegion(String regionUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE ESTADO_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByEstado(String estadoUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE ID_ROL = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByIdRol(int rolUsuario);

    public Usuarios findById(int id);
}
