package br.ufrpe.rubank.repositories;

import br.ufrpe.rubank.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
