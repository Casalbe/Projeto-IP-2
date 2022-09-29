package br.ufrpe.rubank.repositories;

import br.ufrpe.rubank.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AccountRepository extends MongoRepository<Account, String > {

}
