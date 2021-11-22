package com.proyecto.peludo.service.impl;

import com.proyecto.peludo.jpa.entity.Usuario;
import com.proyecto.peludo.jpa.repository.UsuarioRepository;
import com.proyecto.peludo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioServiceImpl implements UsuarioService {
//public class UsuarioServiceImpl{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuario(String email) {
        return null;
    }

    //obtener la lista de usuarios
    public ArrayList<Usuario> obtenerUsuario(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
