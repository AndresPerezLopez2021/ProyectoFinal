package com.proyecto.peludo.service.impl;

import com.proyecto.peludo.dto.AnimalesRequestDTO;
import com.proyecto.peludo.jpa.entity.Animal;
import com.proyecto.peludo.jpa.entity.Raza;
import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.jpa.repository.AnimalRepository;
import com.proyecto.peludo.jpa.repository.RazaRepository;
import com.proyecto.peludo.jpa.repository.UsuarioRepository;
import com.proyecto.peludo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private RazaRepository razaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Animal getAnimal(String estadoAnimal){return null;}

    //Obtener lista de animales
    @Override
    public ArrayList<Animal> obtenerAnimal() {
        return  (ArrayList<Animal>)  animalRepository.findAll();
    }

    @Override
    public Animal guardarAnimal (AnimalesRequestDTO animalesRequest) {

        try {
            Optional<Usuario> usuarioBBDD = usuarioRepository.findByEmail(animalesRequest.getEmail());
            Optional<Raza> razaBBDD = razaRepository.findByIdRazaAndIdEspecie(animalesRequest.getIdRaza(), animalesRequest.getIdEspecie());

            Usuario usuario = null;
            Raza raza = null;

            if (usuarioBBDD.isPresent()) {
                usuario = usuarioBBDD.get();
            }

            if (razaBBDD.isPresent()) {
                raza = razaBBDD.get();
            }

            Animal animal = new Animal();
            animal.setEstadoAnimal(animalesRequest.getEstadoAnimal());
            animal.setFechaEncontrado(animalesRequest.getFechaEncontrado());
            animal.setLugarEncontrado(animalesRequest.getLocalidad());
            animal.setIdRaza(raza.getIdRazaTabla());
            animal.setUsuario(usuario);

            return animalRepository.save(animal);
        } catch (Exception e) {

            return new Animal();
        }
    }
}
