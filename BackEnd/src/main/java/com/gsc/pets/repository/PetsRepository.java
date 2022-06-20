package com.gsc.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gsc.pets.model.Pets;

import java.util.List;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long>{


    @Query(value ="SELECT * FROM PETS WHERE status = 0", nativeQuery = true)
    List<Pets> findAllAtivos();



    @Query(value ="SELECT * FROM PETS WHERE status = 1", nativeQuery = true)
    List<Pets> findAllInativos();
    Pets findByNome(String nome);
}
