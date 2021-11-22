package com.proyecto.peludo.controller;

import com.proyecto.peludo.jpa.entity.Animal;
import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.service.DAOs.UsuarioDAO;
import com.proyecto.peludo.service.DAOs.UsuarioDAOImpl;
import com.proyecto.peludo.service.PeludoService;
import com.proyecto.peludo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class peludoController {

    @Autowired
    private PeludoService peludoService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/animal")
    public ResponseEntity<List<Animal>> animaleList() {

        List<Animal> animalList = peludoService.getAnimal();

        return new ResponseEntity(animalList, HttpStatus.OK);
    }
    /*
    @PostMapping(value = "guardarAnimales")
    public void guardarAnimales(){
        AnimalDAO.save();
    }
*/
    @GetMapping(value = "/consultaUsuario")
    public ResponseEntity<Usuario> consultaUsuario(String email) {
        Usuario usuario = usuarioService.getUsuario(email);

        return new ResponseEntity(usuario, HttpStatus.OK);
    }
}
