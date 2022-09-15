package br.ufrpe.rubank.api.models;

public class Admin {
  private String cpf;
  private String name;
  private String username;
  private String password;

  public Admin(String cpf, String name, String username, String password) {
    setCpf(cpf);
    setName(name);
    setUsername(username);
    setPassword(password);
  }

  public String getCpf() { return cpf; }
  public void setCpf(String cpf) { this.cpf = cpf; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getUsername() { return username; }
  public void setUsername(String username) { this.username = username; }

  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }
}
