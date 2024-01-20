package padroesComportamentais.chainOfResponsability;

public class App {
    public static void main(String[] args) {
        DistribuidoraCedula distribuidoraCedula = new DistribuidoraCedula();
        System.out.println("Saque de R$791,00");
        distribuidoraCedula.saque(791);

        System.out.println();
        System.out.println("Saque otimizado de R$791,00");
        DistribuidoraCedula distribuidoraCedulaOtimizada = new DistribuidoraCedula(new Cedula(100),
                                                           new Cedula(50), new Cedula(1));
        distribuidoraCedulaOtimizada.saque(791);
    }
}
