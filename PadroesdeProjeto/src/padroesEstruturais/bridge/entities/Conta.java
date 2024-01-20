package padroesEstruturais.bridge.entities;

public abstract class Conta {
    protected String conta;
    protected String agencia;
    protected Double saldo;
    protected String nomeCliente;

    public Conta(String conta, String agencia, Double saldo, String nomeCliente) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
