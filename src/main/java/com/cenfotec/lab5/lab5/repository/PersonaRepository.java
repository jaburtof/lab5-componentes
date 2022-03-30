package com.cenfotec.lab5.lab5.repository;

import com.cenfotec.lab5.lab5.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    Persona findPersonaByNombre(String nombre);
}
