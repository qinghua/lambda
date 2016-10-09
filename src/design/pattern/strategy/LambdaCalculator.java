package design.pattern.strategy;

import java.util.function.Function;

public class LambdaCalculator {

    private Function<Integer, Integer> strategy;

    public LambdaCalculator(Function<Integer, Integer> strategy) {
        this.strategy = strategy;
    }

    public static void main(String args[]) {
        LambdaCalculator calculator1 = new LambdaCalculator(param -> 0);
        LambdaCalculator calculator2 = new LambdaCalculator(param -> param * param);
        calculator1.calc(5);
        calculator2.calc(5);
    }

    public void calc(int param) {
        System.out.println(strategy.apply(param));
    }
}
