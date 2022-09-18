package br.ufrpe.rubank.services;

import br.ufrpe.rubank.models.Person;

public interface PersonService {

    public void create(Person person);

    public Person findOne(String cpf);
}
