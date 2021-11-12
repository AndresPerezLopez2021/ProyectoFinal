package com.proyecto.peludo.controller;

import com.proyecto.peludo.jpa.entity.Animal;
import com.proyecto.peludo.service.PeludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class peludoController {

    @Autowired
    private PeludoService peludoService;

    @RequestMapping(value = "/animales", method = RequestMethod.GET)
    public ResponseEntity<List<Animal>> animaleList() {

        List<Animal> animalList = peludoService.getAnimal();

        return new ResponseEntity(animalList, HttpStatus.OK);
    }
}
