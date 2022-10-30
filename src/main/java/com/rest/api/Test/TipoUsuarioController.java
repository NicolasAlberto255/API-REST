/*
 * package com.rest.api.Test;
 * 
 * import java.util.ArrayList;
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import com.rest.api.models.TipoUsuarioModel;
 * import com.rest.api.services.TipoUsuarioService;
 * 
 * @RestController
 * public class TipoUsuarioController {
 * 
 * @Autowired
 * TipoUsuarioService tipoUsuarioService;
 * 
 * @GetMapping("/tipoUsuario")
 * public ArrayList<TipoUsuarioModel> getTipoUsuario() {
 * return tipoUsuarioService.getTipoUsuario();
 * }
 * 
 * @PostMapping(path = "/tipoUsuarioSave")
 * public TipoUsuarioModel saveUser(@RequestBody TipoUsuarioModel tipoUsuario) {
 * return this.tipoUsuarioService.saveTipoUsuario(tipoUsuario);
 * }
 * 
 * @GetMapping(path = "/tipoUsuarioGet/{id}")
 * public TipoUsuarioModel findById(@PathVariable("id") Long id) {
 * return this.tipoUsuarioService.findById(id);
 * }
 * 
 * @PutMapping(path = "/tipoUsuarioUpdate/{id}")
 * public String updateTipoUsuario(@PathVariable("id") Long id, @RequestBody
 * TipoUsuarioModel tipoUsuario) {
 * TipoUsuarioModel tipoUsuarioUpdate = tipoUsuarioService.findById(id);
 * tipoUsuarioUpdate.setNombreTipoUsuario(tipoUsuario.getNombreTipoUsuario());
 * tipoUsuarioService.saveTipoUsuario(tipoUsuarioUpdate);
 * return "Tipo de Usuario actualizado";
 * }
 * 
 * @DeleteMapping(path = "tipoUsuarioDel/{id}")
 * public String deleteById(@PathVariable("id") Long id) {
 * boolean ok = this.tipoUsuarioService.deleteTipoUsuario(id);
 * if (ok) {
 * return "Se eliminó el Tipo de Usuari con id " + id;
 * } else {
 * return "No se pudo eliminar el Tipo de Usuario con id " + id;
 * }
 * }
 * }
 */