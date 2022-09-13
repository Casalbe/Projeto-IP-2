import java.time.LocalDate;

class Conta {
    // ATRIBUTOS
    private String id;
    private boolean aprovado;
    private boolean travada;
    private LocalDate dataDeAbertura;
    private double saldo;
    private Transacao[] historico;

    // MÉTODOS GET/SET
    public String getId() { return id; }
    public boolean getAprovado() { return aprovado; };
    public boolean getTravada() { return travada; }
    public LocalDate getDataDeAbertura() { return dataDeAbertura; }
    public double getSaldo() { return saldo; }
    public Transacao[] getHistorico() { return historico; }

    public void setId(String id) { this.id = id; }
    public void setAprovado(boolean aprovado) { this.aprovado = aprovado; };
    public void setTravada(boolean travada) { this.travada = travada; }
    public void setDataDeAbertura(LocalDate dataDeAbertura) { this.dataDeAbertura = dataDeAbertura; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setHistorico(Transacao[] historico) { this.historico = historico; }
}