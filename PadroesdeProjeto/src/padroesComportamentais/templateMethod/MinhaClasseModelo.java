package padroesComportamentais.templateMethod;
/*
  Como posso unir partes de um código que não variam com partes variáveis?
  Como posso alterar certos pontos do código mantendo uma estrutura?

  Resposta: Definir uma abstração com todos os pontos que podem ser variados
            Criar um template que contenha as partes fixas e possua pontos de chamadas para as partes variáveis.

  Padrão Template Method: Defini o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos
  a serem preenchidos pelas subclasses.

  Template Method permite que subclasses redefinam certos passos de um algoritmo sem mudar a sua estrutura.

*/
public abstract class MinhaClasseModelo {
    public final void metodoFinal() {
        System.out.println("Método final executado.");
    }

    public void metodoA() {
        System.out.println("Método A executado.");
    }

    protected abstract void metodoBModelo();
}
