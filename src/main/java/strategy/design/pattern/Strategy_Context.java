package strategy.design.pattern;

public class Strategy_Context {
    private Calculation_Strategy calculationStrategy;
    public Strategy_Context(Calculation_Strategy calculationStrategy){
        this.calculationStrategy=calculationStrategy;
    }
    public double execute_calculation_strategy(double a,double b){
        return this.calculationStrategy.calculation(a,b);
    }
}
