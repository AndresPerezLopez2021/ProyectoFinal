package com.proyecto.peludo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "animal")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_animal")
    private Integer idAnimal;

    @Column(name = "lugar_encontrado", nullable = false)
    private String lugarEncontrado;

    @Column(name = "fecha_encontrado", nullable = false)
    private LocalDateTime fechaEncontrado;

    @Column(name = "fecha_baja")
    private LocalDateTime fechaBaja;

    @Column (name = "estado_animal", nullable = false)
    private String estadoAnimal;

    /*@OneToMany(mappedBy = "tipo_raza")
    private TipoRaza tipoRaza;

    @OneToMany(mappedBy = "id_usuario")
    private Usuario usuario;*/

    public Animal(Integer idAnimal, String lugarEncontrado, LocalDateTime fechaEncontrado, LocalDateTime fechaBaja) {
        this.idAnimal = idAnimal;
        this.lugarEncontrado = lugarEncontrado;
        this.fechaEncontrado = fechaEncontrado;
        this.fechaBaja = fechaBaja;
    }

    public Animal() {
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public String getLugarEncontrado() {
        return lugarEncontrado;
    }

    public LocalDateTime getFechaEncontrado() {
        return fechaEncontrado;
    }

    public LocalDateTime getFechaBaja() {
        return fechaBaja;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setLugarEncontrado(String lugarEncontrado) {
        this.lugarEncontrado = lugarEncontrado;
    }

    public void setFechaEncontrado(LocalDateTime fechaEncontrado) {
        this.fechaEncontrado = fechaEncontrado;
    }

    public void setFechaBaja(LocalDateTime fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(idAnimal, animal.idAnimal) && Objects.equals(lugarEncontrado, animal.lugarEncontrado) && Objects.equals(fechaEncontrado, animal.fechaEncontrado) && Objects.equals(fechaBaja, animal.fechaBaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimal, lugarEncontrado, fechaEncontrado, fechaBaja);
    }

    @Override
    public String toString() {
        return "{ " +
                "Lista de Animales" +
                "idAnimal=" + idAnimal +
                ", lugarEncontrado='" + lugarEncontrado + '\'' +
                ", fechaEncontrado=" + fechaEncontrado +
                ", fechaBaja=" + fechaBaja + '}';
    }
}
