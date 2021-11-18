package com.proyecto.peludo.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Especie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_especie")
    private int idEspecie;

    @Column(name = "id_raza")
    private int idRaza;

    @Column(name = "nombre")
    private String nombre;

    public Especie(int idEspecie, int idRaza, String nombre) {
        this.idEspecie = idEspecie;
        this.idRaza = idRaza;
        this.nombre = nombre;
    }

    public Especie() {
    }

    public int getIdEspecie() { return idEspecie; }

    public void setIdEspecie(int idEspecie) { this.idEspecie = idEspecie; }

    public int getIdRaza() { return idRaza; }

    public void setIdRaza(int idRaza) { this.idRaza = idRaza; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especie especie = (Especie) o;
        return Objects.equals(idEspecie, especie.idEspecie) && Objects.equals(idRaza, especie.idRaza) && Objects.equals(nombre, especie.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEspecie, idRaza, nombre);
    }

    @Override
    public String toString() {
        return "Especie{" +
                "idEspecie=" + idEspecie +
                ", idRaza=" + idRaza +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
