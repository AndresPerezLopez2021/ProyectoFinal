package com.proyecto.peludo.controller;


import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/allUsuarios")
    public ArrayList<Usuario> obtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @PostMapping("/usuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){

        return usuarioService.guardarUsuario(usuario);
    }
}
