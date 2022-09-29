package br.ufrpe.rubank.services.impl;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.Favorite;
import br.ufrpe.rubank.models.History;
import br.ufrpe.rubank.repositories.AccountRepository;
import br.ufrpe.rubank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PersonService personService;

    @Override
    public void create(Account account) {
        this.accountRepository.save(account);
    }

    @Override
    public Account findOne(String id) {
        return this.accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account update(Account account) { this.accountRepository.save(account);
        return account;
    }

    @Override
    public void delete(String id) {
        this.personService.haveAccount(id, false);
        this.accountRepository.deleteById(id);
    }

    @Override
    public Account addFavorite(String id, Favorite favorite) {
        Account account = this.findOne(id);
        account.addFavorite(favorite);
        this.update(account);
        return account;
    }

    @Override
    public Account removeFavorite(String id, Favorite favorite) {
        Account account = this.findOne(id);
        account.removeFavorite(favorite);
        this.update(account);
        return account;
    }

    @Override
    public void addHistory(String id, History history) {
        Account account = this.findOne(id);
        account.addHistory(history);
        this.update(account);
    }

    @Override
    public void addToBalance(String id, Double value) {
        Account account = this.findOne(id);
        account.addToBalance(value);
        this.update(account);
    }

    @Override
    public void removeFromBalance(String id, Double value) {
        Account account = this.findOne(id);
        account.removeFromBalance(value);
        this.update(account);
    }
}
