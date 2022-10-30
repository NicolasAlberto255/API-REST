
/*
 * package com.rest.api.Test;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.stereotype.Service;
 * import com.rest.api.models.TipoUsuarioModel;
 * import com.rest.api.repositories.TipoUsuarioRepository;
 * import java.util.ArrayList;
 * 
 * @Service
 * public class TipoUsuarioService {
 * 
 * @Autowired
 * TipoUsuarioRepository tipoUsuarioRepository;
 * 
 * public ArrayList<TipoUsuarioModel> getTipoUsuario() {
 * return (ArrayList<TipoUsuarioModel>) tipoUsuarioRepository.findAll();
 * }
 * 
 * public TipoUsuarioModel saveTipoUsuario(TipoUsuarioModel tipoUsuario) {
 * return tipoUsuarioRepository.save(tipoUsuario);
 * }
 * 
 * public TipoUsuarioModel findById(Long id) {
 * return tipoUsuarioRepository.findById(id).get();
 * }
 * 
 * public boolean deleteTipoUsuario(Long id) {
 * try {
 * tipoUsuarioRepository.deleteById(id);
 * return true;
 * } catch (Exception err) {
 * return false;
 * }
 * }
 * 
 * }
 */