package com.proyecto.peludo.controller;


import com.proyecto.peludo.jpa.entity.Raza;
import com.proyecto.peludo.service.RazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/raza")

public class RazaController {
    @Autowired
    RazaService razaService;

    @GetMapping()
    public ArrayList<Raza> obtenerRaza(){
        return razaService.obtenerRaza();
    }
    @PostMapping()
    public Raza guardarRaza(@RequestBody Raza raza){
        return this.razaService.guardarRaza(raza);
    }
}
