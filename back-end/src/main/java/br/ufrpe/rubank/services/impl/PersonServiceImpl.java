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
    public void create(Person person) {
        this.personRepository.save(person);
    }

    @Override
    public Person findByCpf(String cpf) {
        return this.personRepository
                .findById(cpf)
                .orElseThrow(() -> new IllegalArgumentException("Pessoa não existe."));
    }

    @Override
    public Person haveAccount(String cpf, Boolean haveAccount) {
        Person person = this.findByCpf(cpf);
        person.setHaveAccount(haveAccount);
        this.create(person);
        return person;
    }
}
