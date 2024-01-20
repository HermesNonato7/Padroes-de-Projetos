package padroesComportamentais.chainOfResponsability;

public class DistribuidoraCedula {
    private Cedula cadeia;

    public DistribuidoraCedula() {
        cadeia = new Cedula(200,
                 new Cedula(100,
                 new Cedula(50,
                 new Cedula(20,
                 new Cedula(10,
                 new Cedula(5,
                 new Cedula(2,
                 new Cedula(1,null))))))));
    }

    public DistribuidoraCedula(Cedula... cedulas) {
        for(int indice = 0; indice < cedulas.length -1; indice++) {
            Cedula cedulaAtual = cedulas[indice];
            cedulaAtual.setProximo(cedulas[indice + 1]);
        }
        cadeia = cedulas[0];
    }

    public void saque(Integer quantia) {
        cadeia.execute(quantia);
    }
}
