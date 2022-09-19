package br.ufrpe.rubank.models;

public class AccountDTO {

    private String cpf;
    private String nickname;
    private String password;

    public AccountDTO(String cpf, String nickname, String password) {
        this.cpf = cpf;
        this.nickname = nickname;
        this.password = password;
    }

    public String getCpf() { return cpf; }
    public String getNickname() { return nickname; }
    public String getPassword() { return password; }

}
