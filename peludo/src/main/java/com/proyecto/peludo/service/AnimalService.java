package com.proyecto.peludo.service;

import com.proyecto.peludo.dto.AnimalesRequestDTO;
import com.proyecto.peludo.jpa.entity.Animal;

import java.util.ArrayList;
import java.util.List;

public interface AnimalService {

    Animal getAnimal(String tipo_raza);

    List<Animal> obtenerAnimal();

    Animal guardarAnimal(AnimalesRequestDTO animalesRequest);

    boolean borrarAnimal(Integer idAnimal);
}
