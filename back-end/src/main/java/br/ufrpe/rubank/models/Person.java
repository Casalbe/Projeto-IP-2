package br.ufrpe.rubank.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Person {

    private String cpf;
    private String name;
    private LocalDate birthDate;
    private String State;
    private String zipCode;
    private String email;
    private LocalDate registrationDate;
    private Boolean haveAccount;

    public Person(
            String name,
            String cpf,
            LocalDate birthDate,
            String state,
            String zipCode,
            String email
    ) {
        this.setName(name);
        this.setCpf(cpf);
        this.setBirthDate(birthDate);
        this.setState(state);
        this.setEmail(email);
        this.setZipCode(zipCode);
        this.setRegistrationDate(LocalDate.now());
        this.setHaveAccount(false);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getState() { return State; }
    public void setState(String state) { State = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    private void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }

    public Boolean getHaveAccount() { return haveAccount; }
    public void setHaveAccount(Boolean haveAccount) { this.haveAccount = haveAccount; }
}
