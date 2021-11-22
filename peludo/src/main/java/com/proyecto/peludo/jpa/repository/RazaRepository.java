package com.proyecto.peludo.jpa.repository;


import com.proyecto.peludo.jpa.entity.Raza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Integer> {

}
