package com.proyecto.peludo.service.DAOs;

import com.proyecto.peludo.jpa.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO {
    public void create (Usuario usuario);
    public Usuario find (Integer usuarioId);
    public void update (Usuario usuario);
    public void remove (Integer usuarioId);
}
