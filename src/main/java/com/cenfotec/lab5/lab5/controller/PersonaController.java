package com.cenfotec.lab5.lab5.controller;

import com.cenfotec.lab5.lab5.domain.Journal;
import com.cenfotec.lab5.lab5.domain.Persona;
import com.cenfotec.lab5.lab5.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;
import java.util.Date;

@Controller
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @RequestMapping("/verPersonas")
    public String index(Model model){
        model.addAttribute("persona", personaService.getAll());
        return "verPersonas";
    }
    @RequestMapping(value = "/agregarPersona", method = RequestMethod.GET)
    public String navegarPaginaPersona(Model model){
        model.addAttribute(new Persona());
        return "agregarPersona";
    }

    @RequestMapping(value = "/agregarPersona", method = RequestMethod.POST)
    public String accionInsertarPersona(Persona persona, BindingResult result, Model model){
        persona.setDateOfBirth(Date.from(Instant.now()));
        personaService.savePersona(persona);
        return "exito";
    }

}
