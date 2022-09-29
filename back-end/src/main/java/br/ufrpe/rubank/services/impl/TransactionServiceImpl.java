package br.ufrpe.rubank.services.impl;


import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.repositories.AccountRepository;
import br.ufrpe.rubank.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionService transactionService;

    @Override
    public void transfer(Account from, Account to, double value, String type) {
        from.setBalance(from.getBalance() - value);
        to.setBalance(to.getBalance() + value);
        this.accountRepository.save(from);
        this.accountRepository.save(to);
    }
}
