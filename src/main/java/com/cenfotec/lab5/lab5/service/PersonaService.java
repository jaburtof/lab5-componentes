package com.cenfotec.lab5.lab5.service;

import com.cenfotec.lab5.lab5.domain.Persona;
import com.cenfotec.lab5.lab5.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public void savePersona(Persona persona){
        personaRepository.save(persona);
    }

    public List<Persona> getAll(){
        return personaRepository.findAll();
    }
}
