package br.ufrpe.rubank.services;

import br.ufrpe.rubank.models.Account;

public interface TransactionService {

    public void transfer(Account from, Account to, double value, String type);

}
