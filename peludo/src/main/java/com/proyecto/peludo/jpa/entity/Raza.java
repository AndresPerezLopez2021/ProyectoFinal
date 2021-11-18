package com.proyecto.peludo.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Raza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_raza")
    private  int idRaza;

    @Column(name = "id_animal")
    private int idAnimal;

    @Column(name = "nombre")
    private String nombre;

    public Raza(int idRaza, int idAnimal, String nombre) {
        this.idRaza = idRaza;
        this.idAnimal = idAnimal;
        this.nombre = nombre;
    }

    public Raza() {
    }

    public int getIdRaza() { return idRaza; }

    public void setIdRaza(int idRaza) { this.idRaza = idRaza; }

    public int getIdAnimal() { return idAnimal; }

    public void setIdAnimal(int idAnimal) { this.idAnimal = idAnimal; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raza raza = (Raza) o;
        return Objects.equals(idRaza, raza.idRaza) && Objects.equals(idAnimal, raza.idAnimal) && Objects.equals(nombre, raza.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idRaza, idAnimal, nombre);
    }

    @Override
    public String toString() {
        return "Raza{" +
                "idRaza=" + idRaza +
                ", idAnimal=" + idAnimal +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
