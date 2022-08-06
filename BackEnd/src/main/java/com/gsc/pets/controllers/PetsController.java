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


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PetsController {

	@Autowired
	PetsService petsService;
	@Autowired
	PetsRepository petsRepository;


	/*@GetMapping("/pets")
	public ResponseEntity<List<Pets>> getPets(){

		return ResponseEntity.ok(petsService.findAllPets());
	}*/
	@GetMapping("/pets/{id}")
	public ResponseEntity<PetsDTO> getPetsById(@PathVariable Long id){
			return ResponseEntity.ok(petsService.findById(id));
	}

	@GetMapping("/pets")
	public ResponseEntity<List<PetsDTO>> getPetsIdade(){

		return ResponseEntity.ok(petsService.findAllIdade());
	}
	@GetMapping("/pets/ativos")
	public ResponseEntity<List<PetsDTO>> findAllAtivos(){
		return ResponseEntity.ok(petsService.findAllAtivos());
	}
	@GetMapping("/pets/inativos")
	public ResponseEntity<List<PetsDTO>> findAllInativos(){
		return ResponseEntity.ok(petsService.findAllInativos());
	}
	@PostMapping("/pets")
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
	@PutMapping("/pets/{id}")
	public ResponseEntity<PetsDTO> update(@PathVariable Long id, @RequestBody @Valid PetsDTO petsDTO){
		return ResponseEntity.ok(petsService.update(id, petsDTO));
	}
	@PutMapping("/pets/status/{id}")
	public ResponseEntity<PetsDTO> updateStatus(@PathVariable Long id, @RequestBody @Valid PetsDTO petsDTO){
		return ResponseEntity.ok(petsService.statusPets(id, petsDTO));
	}

	@DeleteMapping("/pets/{id}")
	public ResponseEntity<Pets> delete(@PathVariable Long id){
		return ResponseEntity.ok(petsService.delete(id));
	}



}
