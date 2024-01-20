package padroesCriacionais.builder;
/*
    A utilização do padrão Builder é útil quando a classe tem diversos atributos exigindo por muitas vezes
    a necessidade da criação de diversos construtores diferentes.
 */
public class Pedido {
    private String bebida;
    private String sobremesa;
    private String acompanhamento;
    private String pratoPrincipal;

    //para atender os clientes eu teria que ter diversas variações de construtores para montar o pedido!

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "bebida='" + bebida + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                ", acompanhamento='" + acompanhamento + '\'' +
                ", pratoPrincipal='" + pratoPrincipal + '\'' +
                '}';
    }
}
