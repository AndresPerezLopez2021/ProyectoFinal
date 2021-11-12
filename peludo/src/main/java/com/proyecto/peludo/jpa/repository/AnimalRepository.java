package com.proyecto.peludo.jpa.repository;

import com.proyecto.peludo.jpa.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
