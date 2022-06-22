package com.gsc.pets.service;

import com.gsc.pets.DTO.PetsDTO;
import com.gsc.pets.model.Pets;
import com.gsc.pets.repository.PetsRepository;
import com.gsc.pets.utis.PetsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PetsService {

    @Autowired
    PetsRepository petsRepository;


    public List<Pets> findAllPets() {

        return petsRepository.findAll();
    }

    public List<PetsDTO> findAllIdade() {
        Pets pets = new Pets();
        List<Pets> lPets = petsRepository.findAll();
        List<PetsDTO> petsDTOS = new ArrayList<>();


        lPets.forEach(itens -> {

            PetsUtil petsUtil = new PetsUtil();
            List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String data = format.format(itens.getDateNascimento());
            petsDTOS.add(new PetsDTO(itens.getId(), itens.getNome(), itens.getEspecie(), itens.getPorte(),
                    itens.getStatus(), data, list.get(0), list.get(1), list.get(2)));
        });

        System.out.println("Sou bonitão");

        return petsDTOS;

    }

    public List<PetsDTO> findAllAtivos() {
        Pets pets = new Pets();
        List<Pets> lPets =  petsRepository.findAllAtivos();
        List<PetsDTO> petsDTOS = new ArrayList<>();


        lPets.forEach(itens -> {

            PetsUtil petsUtil = new PetsUtil();
            List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String data = format.format(itens.getDateNascimento());
            petsDTOS.add(new PetsDTO(itens.getId(), itens.getNome(), itens.getEspecie(), itens.getPorte(),
                    itens.getStatus(), data, list.get(0), list.get(1), list.get(2)));
        });

        System.out.println("Sou bonitão");

        return petsDTOS;

    }

    public List<PetsDTO> findAllInativos() {
        Pets pets = new Pets();
        List<Pets> lPets =  petsRepository.findAllInativos();
        List<PetsDTO> petsDTOS = new ArrayList<>();


        lPets.forEach(itens -> {

            PetsUtil petsUtil = new PetsUtil();
            List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String data = format.format(itens.getDateNascimento());
            petsDTOS.add(new PetsDTO(itens.getId(), itens.getNome(), itens.getEspecie(), itens.getPorte(),
                    itens.getStatus(), data, list.get(0), list.get(1), list.get(2)));
        });

        System.out.println("Sou bonitão");

        return petsDTOS;
    }
    public PetsDTO update(Long id, PetsDTO petsDto) {

        Pets pets = petsRepository.findById(id).orElseThrow();
        PetsUtil petsUtil = new PetsUtil();
        PetsDTO idade = new PetsDTO();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse(petsDto.getDateNascimento());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        pets.setNome(petsDto.getNome());
        pets.setEspecie(petsDto.getEspecie());
        pets.setPorte(petsDto.getPorte());
        pets.setStatus(petsDto.getStatus());
        pets.setDateNascimento(data);
        petsRepository.save(pets);
        //exibir no front
        idade.setId(pets.getId());
        idade.setNome(pets.getNome());
        idade.setEspecie(pets.getEspecie());
        idade.setPorte(pets.getPorte());
        idade.setStatus(pets.getStatus());
        idade.setDateNascimento(petsDto.getDateNascimento());
        List<Integer> list = petsUtil.calcularIdade(data);
        idade.setAno(list.get(0));
        idade.setMes(list.get(1));
        idade.setDias(list.get(2));
        return idade;

    }


    public PetsDTO create(PetsDTO petsDto) {

        Pets pets = new Pets();
        PetsUtil petsUtil = new PetsUtil();
        PetsDTO idade = new PetsDTO();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse(petsDto.getDateNascimento());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        pets.setNome(petsDto.getNome());
        pets.setEspecie(petsDto.getEspecie());
        pets.setPorte(petsDto.getPorte());
        pets.setStatus(petsDto.getStatus());
        pets.setDateNascimento(data);
        petsRepository.save(pets);
        //exibir no front
        idade.setId(pets.getId());
        idade.setNome(pets.getNome());
        idade.setEspecie(pets.getEspecie());
        idade.setPorte(pets.getPorte());
        idade.setStatus(pets.getStatus());
        idade.setDateNascimento(petsDto.getDateNascimento());
        List<Integer> list = petsUtil.calcularIdade(data);
        idade.setAno(list.get(0));
        idade.setMes(list.get(1));
        idade.setDias(list.get(2));
        return idade;

    }

    public Pets delete(Long id) {
        Pets pets = petsRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("Cadastro não existe com esse id: " + id);
        });
        petsRepository.delete(pets);
        return pets;
    }

    public PetsDTO findById(long id) {
        Pets itens = petsRepository.findById(id).orElseThrow();

            PetsUtil petsUtil = new PetsUtil();
            List<Integer> list = petsUtil.calcularIdade(itens.getDateNascimento());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String data = format.format(itens.getDateNascimento());
            PetsDTO pets = new PetsDTO(itens.getId(), itens.getNome(), itens.getEspecie(), itens.getPorte(),
                    itens.getStatus(), data, list.get(0), list.get(1), list.get(2));

        System.out.println("Sou bonitão");

        return pets;
    }
}
