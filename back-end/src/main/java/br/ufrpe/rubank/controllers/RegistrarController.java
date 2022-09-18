package br.ufrpe.rubank.controllers;

import br.ufrpe.rubank.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.ufrpe.rubank.services.PersonService;

@RestController
@RequestMapping("/registrar")
public class RegistrarController {

    @Autowired
    private PersonService personService;

    @PostMapping("/pessoa")
    public Person registerPerson(@RequestBody Person person) {
        personService.create(person);
        return person;
    }
}
