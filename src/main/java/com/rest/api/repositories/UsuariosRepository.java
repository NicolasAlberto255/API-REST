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

    public Usuarios findById(int id);

    @Query(value = "SELECT * FROM USUARIO WHERE COMUNA_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByComuna(String comunaUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE REGION_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByRegion(String regionUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE ESTADO_USUARIO = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByEstado(String estadoUsuario);

    @Query(value = "SELECT * FROM USUARIO WHERE ID_ROL = ?1", nativeQuery = true)
    List<Usuarios> getUsuariosByIdRol(int rolUsuario);

    @Query(value = "SELECT COUNT(*) FROM USUARIO", nativeQuery = true)
    int getCountUsuarios();

    @Query(value = "SELECT NOMBRE_ROL,COUNT(*) FROM USUARIO LEFT OUTER JOIN ROLES ON ROLES.ID_ROL = USUARIO.ID_ROL GROUP BY NOMBRE_ROL", nativeQuery = true)
    List<String> getCountUsuariosByRol();

    @Query(value = "SELECT COMUNA_USUARIO,COUNT(COMUNA_USUARIO) FROM USUARIO GROUP BY COMUNA_USUARIO", nativeQuery = true)
    List<String> getCountUsuariosByComuna();

    @Query(value = "SELECT REGION_USUARIO,COUNT(REGION_USUARIO) FROM USUARIO GROUP BY REGION_USUARIO", nativeQuery = true)
    List<String> getCountUsuariosByRegion();
}
