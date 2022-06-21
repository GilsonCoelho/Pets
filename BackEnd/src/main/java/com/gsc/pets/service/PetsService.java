package com.gsc.pets.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsc.pets.DTO.IdadeDTO;
import com.gsc.pets.DTO.PetsDTO;
import com.gsc.pets.utis.PetsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsc.pets.model.Pets;
import com.gsc.pets.repository.PetsRepository;

@Service
public class PetsService {
	
	@Autowired
	PetsRepository petsRepository;
	List<IdadeDTO> idadeDTOS = new ArrayList<>();
	IdadeDTO idade = new IdadeDTO();
	public List<Pets> findAllPets() {
		
		return petsRepository.findAll();
	}

	/*public void printar(){
		Pets pets = new Pets();
		PetsUtil petsUtil = new PetsUtil();
		List<Integer> list = petsUtil.calcularIdade(pets.getDateNascimento());
		list.forEach(num -> System.out.println(num));

	}*/
	/*public List<IdadeDTO> findAllIdade(){
		Pets pets = new Pets();
		List<Pets> lPets = petsRepository.findAll();
		PetsUtil petsUtil = new PetsUtil();
		lPets.forEach(itens -> {
			idade.setId(itens.getId());
			idade.setNome(itens.getNome());
			idade.setPorte(itens.getPorte());
			idade.setStatus(itens.getStatus());
			List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
			idade.setAno(list.get(0));
			idade.setMes(list.get(1));
			idade.setDias(list.get(2));
			IdadeDTO abelha = idade;
			idadeDTOS.add(abelha);

		});

		idadeDTOS.forEach(ida -> {
			System.out.println("ID: " + ida.getId() +
					"\nNome: " + ida.getNome() +
					"\nPorte: " + ida.getPorte() +
					"\nStatus: " + ida.getStatus() +
					"\nAno: " + ida.getAno() +
					"\nMes: " + ida.getMes() +
					"\nDias: " + ida.getDias() + "\n\n");
		});

		System.out.println("Sou bonitão");
		return idadeDTOS;

	}*/
	public List<IdadeDTO> findAllIdade(){
		Pets pets = new Pets();
		List<Pets> lPets = petsRepository.findAll();
		PetsUtil petsUtil = new PetsUtil();
		lPets.forEach(itens -> {
			idade.setId(itens.getId());
			idade.setNome(itens.getNome());
			idade.setPorte(itens.getPorte());
			idade.setStatus(itens.getStatus());
			List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
			idade.setAno(list.get(0));
			idade.setMes(list.get(1));
			idade.setDias(list.get(2));
			idadeDTOS.add(idade);

		});

		idadeDTOS.forEach(ida -> {
			System.out.println("ID: " + ida.getId() +
					"\nNome: " + ida.getNome() +
					"\nPorte: " + ida.getPorte() +
					"\nStatus: " + ida.getStatus() +
					"\nAno: " + ida.getAno() +
					"\nMes: " + ida.getMes() +
					"\nDias: " + ida.getDias() + "\n\n");
		});

		System.out.println("Sou bonitão");
		return idadeDTOS;

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
