package com.gsc.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsc.pets.model.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long>{

}
