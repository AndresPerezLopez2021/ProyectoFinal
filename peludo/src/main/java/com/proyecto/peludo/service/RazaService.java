package com.proyecto.peludo.service;

import com.proyecto.peludo.jpa.entity.Raza;

import java.util.ArrayList;

public interface RazaService {
    Raza getRaza(Integer idRaza);
    ArrayList<Raza> obtenerRaza();
    Raza guardarRaza(Raza raza);
}
