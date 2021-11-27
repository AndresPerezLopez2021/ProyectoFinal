package com.proyecto.peludo.dto;

import java.io.Serializable;
import java.util.Objects;

public class AnimalDeleteRequest implements Serializable {

    private Integer idAnimal;

    public AnimalDeleteRequest() { }

    public AnimalDeleteRequest(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) { this.idAnimal = idAnimal; }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalDeleteRequest that = (AnimalDeleteRequest) o;
        return Objects.equals(idAnimal, that.idAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimal);
    }

    @Override
    public String toString() {
        return "{ idAnimal=" + idAnimal + '}';
    }
}
