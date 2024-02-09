package strategy.design.pattern;

public class Addition implements Calculation_Strategy{
    @Override
    public double calculation(double a, double b) {
        return a+b;
    }
}
