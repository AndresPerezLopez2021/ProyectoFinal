package com.proyecto.peludo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "especie")
public class Especie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie")
    private Integer idEspecie;

    @Column(name = "nombre")
    private String nombre;

    public Especie(Integer idEspecie, String nombre) {
        this.idEspecie = idEspecie;
        this.nombre = nombre;
    }

    public Especie() {
    }

    public Integer getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especie especie = (Especie) o;
        return Objects.equals(idEspecie, especie.idEspecie) && Objects.equals(nombre, especie.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEspecie, nombre);
    }

    @Override
    public String toString() {
        return "{ idEspecie=" + idEspecie +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
