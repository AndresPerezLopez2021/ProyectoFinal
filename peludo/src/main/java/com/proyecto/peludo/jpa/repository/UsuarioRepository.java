package com.proyecto.peludo.jpa.repository;


import com.proyecto.peludo.jpa.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
   // Usuario findByEmail(String email);

}