package com.proyecto.peludo.service.impl;

import com.proyecto.peludo.jpa.entity.Animal;
import com.proyecto.peludo.jpa.repository.AnimalRepository;
import com.proyecto.peludo.service.PeludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class PeludoServiceImpl implements PeludoService {

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public List<Animal> getAnimal() {

        return Collections.emptyList();
    }
}
