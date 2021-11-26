package com.proyecto.peludo.jpa.entity;

import java.io.Serializable;
import java.util.Objects;

public class IdRaza implements Serializable {

    private Integer idRaza;
    private Integer idEspecie;

    public IdRaza() {}

    public IdRaza(Integer idRaza, Integer idEspecie) {
        this.idRaza = idRaza;
        this.idEspecie = idEspecie;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdRaza idRaza1 = (IdRaza) o;
        return Objects.equals(idRaza, idRaza1.idRaza) && Objects.equals(idEspecie, idRaza1.idEspecie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRaza, idEspecie);
    }

    @Override
    public String toString() {
        return "{" +
                "idRaza=" + idRaza +
                ", idEspecie=" + idEspecie +
                '}';
    }
}
