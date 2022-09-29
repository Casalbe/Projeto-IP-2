package br.ufrpe.rubank.services.impl;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.Person;

public interface PersonService {

    public void create(Person person);

    public Person findByCpf(String cpf);

    public Person haveAccount(String cpf, Boolean haveAccount);
}
