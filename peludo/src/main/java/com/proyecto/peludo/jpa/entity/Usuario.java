package com.proyecto.peludo.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name= "contraseña")
    private String contraseña;

    @Column(name = "tipo_usuario")
    private String tipoUsuario;

    public Usuario(Integer idUsuario, String nombre, String email, String contraseña, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    public Integer getIdUsuario() { return idUsuario;}

    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getContraseña() { return contraseña; }

    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getTipoUsuario() { return tipoUsuario; }

    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario) && Objects.equals(nombre, usuario.nombre) && Objects.equals(email, usuario.email) && Objects.equals(contraseña, usuario.contraseña) && Objects.equals(tipoUsuario, usuario.tipoUsuario);
    }

    @Override
    public int hashCode(){return Objects.hash  (idUsuario, nombre, email, contraseña, tipoUsuario);}

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
