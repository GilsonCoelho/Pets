package com.gsc.pets.controllers;

import java.text.ParseException;
import java.util.List;
import com.gsc.pets.DTO.PetsDTO;
import com.gsc.pets.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.*;

import com.gsc.pets.model.Pets;
import com.gsc.pets.service.PetsService;

import javax.validation.Valid;


@RestController
@RequestMapping("/pets")
public class PetsController {

	@Autowired
	PetsService petsService;
	@Autowired
	PetsRepository petsRepository;


	@GetMapping("/list")
	public ResponseEntity<List<Pets>> getPets(){

		return ResponseEntity.ok(petsService.findAllPets());
	}
	@GetMapping("/{id}")
	public ResponseEntity<PetsDTO> getPetsById(@PathVariable Long id){
			return ResponseEntity.ok(petsService.findById(id));
	}

	@GetMapping("/list/idade")
	public ResponseEntity<List<PetsDTO>> getPetsIdade(){

		return ResponseEntity.ok(petsService.findAllIdade());
	}
	@GetMapping("/ativos")
	public ResponseEntity<List<PetsDTO>> findAllAtivos(){
		return ResponseEntity.ok(petsService.findAllAtivos());
	}
	@GetMapping("/inativos")
	public ResponseEntity<List<PetsDTO>> findAllInativos(){
		return ResponseEntity.ok(petsService.findAllInativos());
	}
	@PostMapping("/create")
	public ResponseEntity<PetsDTO> create(@RequestBody @Valid PetsDTO petsDto) throws ParseException {
		List<Pets> lpets = petsRepository.findAll();
		String nome = petsDto.getNome();
		for(Pets pets : lpets){
			if(pets.getNome().equals(nome)){
				return ResponseEntity.status(HttpStatus.CONFLICT).body(petsService.findById(pets.getId()));
			}
		}
			return ResponseEntity.status(HttpStatus.CREATED).body(petsService.create(petsDto));

	}
	@PutMapping("/{id}")
	public ResponseEntity<PetsDTO> update(@PathVariable Long id, @RequestBody @Valid PetsDTO petsDTO){
		return ResponseEntity.ok(petsService.update(id, petsDTO));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Pets> delete(@PathVariable Long id){
		return ResponseEntity.ok(petsService.delete(id));
	}



}
