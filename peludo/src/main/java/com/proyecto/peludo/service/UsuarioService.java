package com.proyecto.peludo.service;

import com.proyecto.peludo.jpa.entity.Usuario;

import java.util.ArrayList;

public interface UsuarioService {
    Usuario getUsuario(String email);

    ArrayList<Usuario> obtenerUsuario();
    Usuario guardarUsuario(Usuario usuario);
}
