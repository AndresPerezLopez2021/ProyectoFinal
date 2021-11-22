package com.proyecto.peludo.controller;


import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }
    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
}
