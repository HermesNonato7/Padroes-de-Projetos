package padroesComportamentais.strategy;

import padroesComportamentais.strategy.strategies.*;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        System.out.println(calculator.getResult(new AdditionOperation()));
        System.out.println(calculator.getResult(new SubtractionOperation()));
        System.out.println(calculator.getResult(new MultiplicationOperation()));
        System.out.println(calculator.getResult(new DivisionOperation()));
    }
}