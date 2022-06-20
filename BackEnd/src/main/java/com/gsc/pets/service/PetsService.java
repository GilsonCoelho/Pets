package com.gsc.pets.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.gsc.pets.DTO.PetsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsc.pets.model.Pets;
import com.gsc.pets.repository.PetsRepository;

@Service
public class PetsService {
	
	@Autowired
	PetsRepository petsRepository;

	public List<Pets> findAllPets() {
		
		return petsRepository.findAll();
	}

    public List<Pets> findAllAtivos() {
		return petsRepository.findAllAtivos();
    }
	public List<Pets> findAllInativos() {
		return petsRepository.findAllInativos();
	}


	public PetsDTO create(PetsDTO petsDto) throws ParseException {
		Pets pets = new Pets();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = format.parse(petsDto.getDateNascimento());
		pets.setNome(petsDto.getNome());
		pets.setPorte(petsDto.getPorte());
		pets.setStatus(petsDto.getStatus());
		pets.setDateNascimento(data);
		petsRepository.save(pets);
		petsDto.setId(pets.getId());
		return petsDto;
		/*
		String nome = pets.getNome();
		Pets list = petsRepository.findByName(pets.getNome());

		if(list == null){
			return petsRepository.save(pets);
        }else{
           return throw new PetsExitsException("Nome de Aminal já exite");
        }
		*/
	}
	public Pets delete(Long id){
		Pets pets = petsRepository.findById(id).orElseThrow(() -> {
			return new RuntimeException("Cadastro não existe com esse id: " + id);
		});
		petsRepository.delete(pets);
		return pets;
	}
}
