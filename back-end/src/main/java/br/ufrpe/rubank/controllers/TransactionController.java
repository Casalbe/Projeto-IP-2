package br.ufrpe.rubank.controllers;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.services.AccountService;
import br.ufrpe.rubank.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private AccountService accountService;
    private TransactionService transactionService;

    @PostMapping("/realizar")
    public void realizarTransacao(
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("value") double value,
            @RequestParam("type") String type
            ) {
        Account fromAccount = accountService.findOne(from);
        Account toAccount = accountService.findOne(to);
        transactionService.transfer(fromAccount, toAccount, value, type);
    }
}
