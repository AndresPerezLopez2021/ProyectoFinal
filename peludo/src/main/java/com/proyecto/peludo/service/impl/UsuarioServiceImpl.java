package com.proyecto.peludo.service.impl;


import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.jpa.repository.UsuarioRepository;
import com.proyecto.peludo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuario(String email) {

        return usuarioRepository.findByEmail(email);
    }
}
