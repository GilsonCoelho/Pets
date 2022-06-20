package com.gsc.pets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsc.pets.model.Pets;
import com.gsc.pets.repository.PetsRepository;

@Service
public class PetsService {
	
	@Autowired
	PetsRepository petsRepository;

	public List<Pets> findall() {
		
		return petsRepository.findAll();
	}

}
