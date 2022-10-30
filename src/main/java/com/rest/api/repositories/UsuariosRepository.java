package com.rest.api.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.models.Usuarios;

@Repository
@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findUsuarioByNombreUsuario(String nombreUsuario);

    List<Usuarios> findUsuarioByApellidoUsuario(String apellidoUsuario);

    List<Usuarios> findUsuarioByCedulaUsuario(String cedulaUsuario);

    public Usuarios findById(int id);
}
