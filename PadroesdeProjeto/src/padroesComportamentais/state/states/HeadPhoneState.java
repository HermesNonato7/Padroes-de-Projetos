package padroesComportamentais.state.states;

import padroesComportamentais.state.HeadPhone;
/*
  Problema: Como posso alterar o comportamento de um objeto quando o seu estado muda?
            Como posso permitir que novos comportamentos sejam adicionados e integrados com os demais?

  Solução:  Modelar os comportamentos possíveis através de estados;
            Definir como serão realizadas as mudanças de estados;
            Cada estado irá tomar controle da execução de acordo com o estado interno do objeto.

  Padrão State: O padrão state permite que um objeto altere o seu comportamento quando o seu estado interno muda.
*/
public interface HeadPhoneState {
    void click(HeadPhone headPhone);
    void longClick(HeadPhone headPhone);
}
