package com.proyecto.peludo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "raza")
@IdClass(IdRaza.class)
public class Raza implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raza_t")
    private Integer idRazaTabla;

    @Id
    @Column(name = "id_raza")
    private Integer idRaza;

    @Id
    @Column(name = "id_especie")
    private Integer idEspecie;

    @Column(name = "nombre")
    private String nombre;

    public Raza() {
    }

    public Raza(Integer idRazaTabla, Integer idRaza, Integer idEspecie, String nombre) {
        this.idRazaTabla = idRazaTabla;
        this.idRaza = idRaza;
        this.idEspecie = idEspecie;
        this.nombre = nombre;
    }

    public Integer getIdRazaTabla() {
        return idRazaTabla;
    }

    public void setIdRazaTabla(Integer idRazaTabla) {
        this.idRazaTabla = idRazaTabla;
    }

    public Integer getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(Integer idRaza) {
        this.idRaza = idRaza;
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
        Raza raza = (Raza) o;
        return Objects.equals(idRazaTabla, raza.idRazaTabla) && Objects.equals(idRaza, raza.idRaza) && Objects.equals(idEspecie, raza.idEspecie) && Objects.equals(nombre, raza.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRazaTabla, idRaza, idEspecie, nombre);
    }

    @Override
    public String toString() {
        return "{idRazaTabla=" + idRazaTabla +
                ", idRaza=" + idRaza +
                ", idEspecie=" + idEspecie +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
