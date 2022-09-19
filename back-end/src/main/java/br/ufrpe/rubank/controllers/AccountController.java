package br.ufrpe.rubank.controllers;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.AccountDTO;
import br.ufrpe.rubank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/criar")
    public Account createAccount(
            @RequestBody AccountDTO accountDTO
            ){
        Account account = new Account(
                accountDTO.getCpf(),
                accountDTO.getNickname(),
                accountDTO.getPassword(),
                200.0
        );
        accountService.create(account);
        return account;
    }
}
