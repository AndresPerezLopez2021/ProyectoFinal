package com.proyecto.peludo.controller;


import com.proyecto.peludo.dto.AnimalDeleteRequest;
import com.proyecto.peludo.dto.AnimalesRequestDTO;
import com.proyecto.peludo.jpa.entity.Animal;
import com.proyecto.peludo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animales")

public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping("/allAnimales")
    public List<Animal> obtenerAnimal(){

        return animalService.obtenerAnimal();
    }
    @PostMapping("/animal")
    public Animal guardarAnimal(@RequestBody AnimalesRequestDTO animalesRequest){
        return animalService.guardarAnimal(animalesRequest);
    }

    @PostMapping("/animal/borrado")
    public boolean borrarAnimal(@RequestBody AnimalDeleteRequest animalDeleteRequest){
        return animalService.borrarAnimal(animalDeleteRequest.getIdAnimal());
    }
}
