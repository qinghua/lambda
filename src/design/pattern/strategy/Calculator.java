package design.pattern.strategy;

public class Calculator {

    private IStrategy strategy;

    public static void main(String args[]) {
        Calculator calculator1 = new Calculator(new ZeroStrategy());
        Calculator calculator2 = new Calculator(new PowerStrategy());
        calculator1.calc(5);
        calculator2.calc(5);
    }

    public Calculator(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void calc(int param) {
        System.out.println(strategy.calc(param));
    }
}
