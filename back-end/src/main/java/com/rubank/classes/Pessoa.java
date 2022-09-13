import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    // ATRIBUTOS
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cidade;
    private String estado;
    private String apelido;
    private LocalDate dataDeNascimento;
    private Conta conta;

    // MÉTODOS GET/SET
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public String getApelido() { return apelido; }
    public LocalDate getDataDeNascimento() { return dataDeNascimento; }
    public Conta getConta() { return conta; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setApelido(String apelido) { this.apelido = apelido; }
    public void setDataDeNascimento(LocalDate dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }
    public void setConta(Conta conta) { this.conta = conta; }

    // OUTROS MÉTODOS
    public int calcularIdade() {
        Period p = Period.between(dataDeNascimento, LocalDate.now());
        return p.getYears();
    }
}