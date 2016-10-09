package design.pattern.strategy;

public class ZeroStrategy implements IStrategy {
    @Override
    public int calc(int param) {
        return 0;
    }
}
