package br.ufrpe.rubank.controllers;

import br.ufrpe.rubank.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.ufrpe.rubank.services.PersonService;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/registrar")
    public Person registerPerson(@RequestBody Person person) {
        this.personService.create(person);
        return person;
    }
}
