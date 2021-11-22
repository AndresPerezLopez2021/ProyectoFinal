package com.proyecto.peludo.jpa.repository;


import com.proyecto.peludo.jpa.entity.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer> {

}