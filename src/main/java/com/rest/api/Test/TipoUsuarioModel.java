/*
 * package com.rest.api.Test;
 * 
 * import java.util.HashSet;
 * import java.util.Set;
 * import javax.persistence.*;
 * 
 * @Entity
 * 
 * @Table(name = "tipoUsuario")
 * public class TipoUsuarioModel {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "idTipoUsuario", unique = true, nullable = false)
 * Long id;
 * 
 * @Column(name = "nombreTipoUsuario")
 * String nombreTipoUsuario;
 * 
 * // @ManyToOne(cascade = CascadeType.ALL)
 * // private UsuarioModel usuario;
 * 
 * // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
 * // @JoinColumn(name = "idTipoUsuario")
 * // private Set<UsuarioModel> usuarios = new HashSet<>();
 * 
 * @OneToOne(mappedBy = "tipoUsuario")
 * private UsuarioModel usuario;
 * 
 * public TipoUsuarioModel() {
 * }
 * 
 * public TipoUsuarioModel(Long id, String nombreTipoUsuario, UsuarioModel
 * usuario) {
 * this.id = id;
 * this.nombreTipoUsuario = nombreTipoUsuario;
 * this.usuario = usuario;
 * }
 * 
 * public Long getId() {
 * return id;
 * }
 * 
 * public void setId(Long id) {
 * this.id = id;
 * }
 * 
 * public String getNombreTipoUsuario() {
 * return nombreTipoUsuario;
 * }
 * 
 * public void setNombreTipoUsuario(String nombreTipoUsuario) {
 * this.nombreTipoUsuario = nombreTipoUsuario;
 * }
 * 
 * public UsuarioModel getUsuario() {
 * return usuario;
 * }
 * 
 * public void setUsuario(UsuarioModel usuario) {
 * this.usuario = usuario;
 * }
 * 
 * }
 */