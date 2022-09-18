package br.ufrpe.rubank.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrpe.rubank.repositories.PersonRepository;
import br.ufrpe.rubank.services.PersonService;
import br.ufrpe.rubank.models.Person;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void create(Person person) { this.personRepository.save(person); }

    @Override
    public Person findOne(String cpf) { return this.personRepository.findById(cpf).orElse(null); }
}
