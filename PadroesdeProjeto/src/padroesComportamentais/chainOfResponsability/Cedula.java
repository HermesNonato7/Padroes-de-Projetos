package padroesComportamentais.chainOfResponsability;

/*
Como posso evitar o acoplamento entre o remetente de uma solicitação e seu receptor?
Como posso permitir que mais que um objeto possa atender alguma requisição?

Solução: Definir uma cadeia de objetos onde cada um poderá responder aquela solicitação ou enviar para o próximo objeto tratar.
         Quem faz a solicitação não precisa saber o tamanho da cadeia, ou mesmo como e por quem ela será resolvida.

 O padrão Chain of responsability (Cadeia de responsabilidade) evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto
 a chance de servir a requisição.  Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva.
*/
public class Cedula {
    private Integer valor;
    private Cedula proximo;

    public Cedula(Integer valor) {
        this.valor = valor;
    }

    public Cedula(Integer valor, Cedula proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public void setProximo(Cedula cedula) {
        this.proximo = cedula;
    }

    public void execute(Integer residual) {
        if(residual >= valor) {
            int cedula = residual / valor;
            residual %= valor;//pega o resto da divisão
            System.out.println(String.format("- %d cédula(s) de $%d, $%d residual", cedula, valor, residual));
        }
        if (residual == 0) return;
        if(proximo != null) proximo.execute(residual);
    }
}
