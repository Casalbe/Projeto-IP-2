package br.ufrpe.rubank.controllers;

import br.ufrpe.rubank.models.Account;
import br.ufrpe.rubank.models.AccountDTO;
import br.ufrpe.rubank.models.Favorite;
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

    @GetMapping("/buscar/{cpf}")
    public Account findByCpf(@PathVariable String cpf){
        return accountService.findByCpf(cpf);
    }

    @PostMapping("/atualizar")
    public Account updateAccount(@RequestBody Account account){
        return accountService.update(account);
    }

    @PostMapping("/deletar")
    public void deleteAccount(@RequestParam String id){
        accountService.delete(id);
    }

    @PostMapping("/adicionarFavorito")
    public Account addFavorite(
            @RequestParam String cpf,
            @RequestBody Favorite favorite
    ){
        return accountService.addFavorite(cpf, favorite);
    }

    @PostMapping("/removerFavorito")
    public Account removeFavorite(
            @RequestParam String cpf,
            @RequestBody Favorite favorite
    ){
        return accountService.removeFavorite(cpf, favorite);
    }


}
