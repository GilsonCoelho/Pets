package com.gsc.pets.controllers;

import java.text.ParseException;
import java.util.List;

import com.gsc.pets.DTO.IdadeDTO;
import com.gsc.pets.DTO.PetsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gsc.pets.model.Pets;
import com.gsc.pets.service.PetsService;

import javax.validation.Valid;


@RestController
@RequestMapping("/pets")
public class PetsController {

	@Autowired
	PetsService petsService;


	@GetMapping("/list")
	public ResponseEntity<List<Pets>> getPets(){

		return ResponseEntity.ok(petsService.findAllPets());
	}
	@GetMapping("/list/idade")
	public ResponseEntity<List<IdadeDTO>> getPetsIdade(){

		return ResponseEntity.ok(petsService.findAllIdade());
	}
	@GetMapping("/ativos")
	public ResponseEntity<List<Pets>> findAllAtivos(){
		return ResponseEntity.ok(petsService.findAllAtivos());
	}
	@GetMapping("/inativos")
	public ResponseEntity<List<Pets>> findAllInativos(){
		return ResponseEntity.ok(petsService.findAllInativos());
	}
	@PostMapping("/create")
	public ResponseEntity<PetsDTO> create(@RequestBody @Valid PetsDTO petsDto){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(petsService.create(petsDto));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Pets> delete(@PathVariable Long id){
		return ResponseEntity.ok(petsService.delete(id));
	}



}
