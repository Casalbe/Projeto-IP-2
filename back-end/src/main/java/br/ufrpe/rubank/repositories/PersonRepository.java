package br.ufrpe.rubank.repositories;

import br.ufrpe.rubank.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

}
