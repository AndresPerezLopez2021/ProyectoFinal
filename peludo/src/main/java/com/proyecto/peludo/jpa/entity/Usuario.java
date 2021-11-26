package com.proyecto.peludo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name= "contraseña")
    private String pass;

    @Column(name = "tipo_usuario")
    private String tipoUsuario;

    public Usuario() { }

    public Usuario(Integer idUsuario, String nombre, String email, String pass, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getIdUsuario() { return idUsuario;}

    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPass() { return pass; }

    public void setPass(String pass) { this.pass = pass; }

    public String getTipoUsuario() { return tipoUsuario; }

    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario) && Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(email, usuario.email) && Objects.equals(pass, usuario.pass) &&
                Objects.equals(tipoUsuario, usuario.tipoUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, email, pass, tipoUsuario);
    }

    @Override
    public String toString() {
        return "{ idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' + '}';
    }
}
