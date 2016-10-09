package design.pattern.strategy;

public class PowStrategy implements IStrategy {
    @Override
    public int calc(int param) {
        return param * param;
    }
}
