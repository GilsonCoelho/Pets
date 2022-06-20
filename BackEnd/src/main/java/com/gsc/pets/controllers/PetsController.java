package com.gsc.pets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsc.pets.model.Pets;
import com.gsc.pets.service.PetsService;


@RestController
@RequestMapping("/pets")
public class PetsController {
	
	@Autowired
	PetsService petsService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Pets>> findAll(){
		return ResponseEntity.ok(petsService.findall());
	}
	
	

}
