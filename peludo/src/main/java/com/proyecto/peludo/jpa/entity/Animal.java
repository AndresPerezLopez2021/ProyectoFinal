package com.proyecto.peludo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "animal")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal")
    private Integer idAnimal;

    @Column(name = "lugar_encontrado", nullable = false)
    private String lugarEncontrado;

    @Column(name = "fecha_encontrado", nullable = false)
    private LocalDateTime fechaEncontrado;

    @Column(name = "fecha_baja")
    private LocalDateTime fechaBaja;

    @Column (name = "estado_animal", nullable = false, length = 150)
    private String estadoAnimal;

    @Column (name = "id_raza_t")
    private Integer idRaza;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    public Animal() { }

    public Animal(Integer idAnimal, String lugarEncontrado, LocalDateTime fechaEncontrado, LocalDateTime fechaBaja, String estadoAnimal, Integer idRaza, Usuario usuario) {
        this.idAnimal = idAnimal;
        this.lugarEncontrado = lugarEncontrado;
        this.fechaEncontrado = fechaEncontrado;
        this.fechaBaja = fechaBaja;
        this.estadoAnimal = estadoAnimal;
        this.idRaza = idRaza;
        this.usuario = usuario;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getLugarEncontrado() {
        return lugarEncontrado;
    }

    public void setLugarEncontrado(String lugarEncontrado) {
        this.lugarEncontrado = lugarEncontrado;
    }

    public LocalDateTime getFechaEncontrado() {
        return fechaEncontrado;
    }

    public void setFechaEncontrado(LocalDateTime fechaEncontrado) {
        this.fechaEncontrado = fechaEncontrado;
    }

    public LocalDateTime getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDateTime fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(String estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public Integer getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(Integer idRaza) {
        this.idRaza = idRaza;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(idAnimal, animal.idAnimal) && Objects.equals(lugarEncontrado, animal.lugarEncontrado) && Objects.equals(fechaEncontrado, animal.fechaEncontrado) && Objects.equals(fechaBaja, animal.fechaBaja) && Objects.equals(estadoAnimal, animal.estadoAnimal) && Objects.equals(idRaza, animal.idRaza) && Objects.equals(usuario, animal.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimal, lugarEncontrado, fechaEncontrado, fechaBaja, estadoAnimal, idRaza, usuario);
    }

    @Override
    public String toString() {
        return "{" +
                "idAnimal=" + idAnimal +
                ", lugarEncontrado='" + lugarEncontrado + '\'' +
                ", fechaEncontrado=" + fechaEncontrado +
                ", fechaBaja=" + fechaBaja +
                ", estadoAnimal='" + estadoAnimal + '\'' +
                ", idRaza=" + idRaza +
                ", usuario=" + usuario +
                '}';
    }
}
