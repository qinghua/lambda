package design.pattern.strategy;

public class PowerStrategy implements IStrategy {
    @Override
    public int calc(int param) {
        return param * param;
    }
}
