package com.proyecto.peludo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class AnimalesRequestDTO implements Serializable {

    private String email;
    private Integer idRaza;
    private Integer idEspecie;
    private LocalDateTime fechaEncontrado;
    private String localidad;
    private String urlImg;
    private String estadoAnimal;

    public AnimalesRequestDTO() {
    }

    public AnimalesRequestDTO(String email,
                              Integer idRaza,
                              Integer idEspecie,
                              LocalDateTime fechaEncontrado,
                              String localidad,
                              String urlImg,
                              String estadoAnimal) {

        this.email = email;
        this.idRaza = idRaza;
        this.idEspecie = idEspecie;
        this.fechaEncontrado = fechaEncontrado;
        this.localidad = localidad;
        this.urlImg = urlImg;
        this.estadoAnimal = estadoAnimal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDateTime getFechaEncontrado() {
        return fechaEncontrado;
    }

    public void setFechaEncontrado(LocalDateTime fechaEncontrado) {
        this.fechaEncontrado = fechaEncontrado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(String estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalesRequestDTO that = (AnimalesRequestDTO) o;
        return Objects.equals(email, that.email) && Objects.equals(idRaza, that.idRaza) &&
                Objects.equals(idEspecie, that.idEspecie) && Objects.equals(fechaEncontrado, that.fechaEncontrado) &&
                Objects.equals(localidad, that.localidad) && Objects.equals(urlImg, that.urlImg) && Objects.equals(estadoAnimal, that.estadoAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, idRaza, idEspecie, fechaEncontrado, localidad, urlImg, estadoAnimal);
    }

    @Override
    public String toString() {
        return "{ email='" + email + '\'' +
                ", idRaza=" + idRaza +
                ", idEspecie=" + idEspecie +
                ", fechaEncontrado=" + fechaEncontrado +
                ", localidad='" + localidad + '\'' +
                ", urlImg='" + urlImg + '\'' +
                ", estadoAnimal='" + estadoAnimal + '\'' + '}';
    }
}

