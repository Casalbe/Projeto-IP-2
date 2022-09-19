package br.ufrpe.rubank.repositories;

import br.ufrpe.rubank.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AccountRepository extends MongoRepository<Account, String > {

    @Query("{ 'nickname' : ?0 }")
    public Account findByNickname(String nickname);

    @Query("{ 'nickname' : ?0, 'password' : ?1 }")
    public Account findByNicknameAndPassword(String nickname, String password);
}
