package br.ufrpe.rubank.api.models;

public class Account {
  private String accountNumber;
  private double balance;
  private String ownerCpf;
  private String nickname;

  public Account(String accountNumber, double balance, String ownerCpf) {
    setAccountNumber(accountNumber);
    setBalance(balance);
    setOwnerCpf(ownerCpf);
  }

  public String getAccountNumber() { return accountNumber; }
  public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

  public double getBalance() { return balance; }
  public void setBalance(double balance) { this.balance = balance; }

  public String getOwnerCpf() { return ownerCpf; }
  public void setOwnerCpf(String ownerCpf) { this.ownerCpf = ownerCpf; }

  public String getNickname() { return nickname; }
  public void setNickname(String nickname) { this.nickname = nickname; }
}
