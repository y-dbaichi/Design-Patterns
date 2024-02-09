package strategy.design.pattern;

public class Multiplication implements Calculation_Strategy {

    @Override
    public double calculation(double a, double b) {
        return a*b;
    }
}
