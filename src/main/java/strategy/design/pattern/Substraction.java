package strategy.design.pattern;

public class Substraction implements Calculation_Strategy{
    @Override
    public double calculation(double a, double b) {
        return a-b;
    }
}
