package com.proyecto.peludo.service;

import com.proyecto.peludo.dto.AnimalesRequestDTO;
import com.proyecto.peludo.jpa.entity.Animal;

import java.util.ArrayList;

public interface AnimalService {

    Animal getAnimal(String tipo_raza);

    ArrayList<Animal> obtenerAnimal();

    Animal guardarAnimal(AnimalesRequestDTO animalesRequest);
}
