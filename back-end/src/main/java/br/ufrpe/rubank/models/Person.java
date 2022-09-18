package br.ufrpe.rubank.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Person {

    private String name;
    @Id
    private String cpf;
    private LocalDate birthDate;
    private String zipCode;
    private String email;
    private String password;

    public Person(
            String name,
            String cpf,
            LocalDate birthDate,
            String zipCode,
            String email,
            String password
    ) {
        this.setName(name);
        this.setCpf(cpf);
        this.setBirthDate(birthDate);
        this.setEmail(email);
        this.setPassword(password);
        this.setZipCode(zipCode);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}
