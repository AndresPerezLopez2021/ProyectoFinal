package com.proyecto.peludo.service;

import com.proyecto.peludo.jpa.entity.Usuario;

public interface UsuarioService {
    Usuario getUsuario(String email);
}
