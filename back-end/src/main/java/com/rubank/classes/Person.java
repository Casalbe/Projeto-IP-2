package br.ufrpe.rubank.api.models;

import java.time.LocalDate;

public class Person {
  private String name;
  private String cpf;
  private LocalDate birthDate;
  private String email;
  private String password;
  private String city;
  private String state;
  private String accountNumber;

  public Person(String name, String cpf, LocalDate birthDate, String email, String password, String city, String state, String nickname) {
    setName(name);
    setCpf(cpf);
    setBirthDate(birthDate);
    setEmail(email);
    setPassword(password);
    setCity(city);
    setState(state);
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  
  public String getCpf() { return cpf; }
  public void setCpf(String cpf) { this.cpf = cpf; }

  public LocalDate getBirthDate() { return birthDate; }
  public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }

  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }

  public String getCity() { return city; }
  public void setCity(String city) { this.city = city; }

  public String getState() { return state; }
  public void setState(String state) { this.state = state; }

  public String getAccountNumber() { return accountNumber; }
  public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
}
