package com.proyecto.peludo.service.impl;

import com.proyecto.peludo.jpa.entity.Raza;
import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.jpa.repository.RazaRepository;
import com.proyecto.peludo.service.RazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RazaServiceImpl  implements RazaService {

    @Autowired
    private RazaRepository razaRepository;

    @Override
    public Raza getRaza(Integer idRaza){
        return null;
    }
    public ArrayList<Raza> obtenerRaza(){
        return (ArrayList<Raza>)  razaRepository.findAll();
    }
    public Raza guardarRaza(Raza raza){
        return razaRepository.save(raza);
    }
}
