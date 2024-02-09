package strategy.design.pattern;

import junit.framework.TestCase;
import org.junit.Test;

public class Strategy_ContextTest extends TestCase {
    @Test
    public void testAdditionStrategy() {
        double expected = 5;
        Calculation_Strategy addition_strategy = new Addition();
        Strategy_Context strategyContext = new Strategy_Context(addition_strategy);
        double result = strategyContext.execute_calculation_strategy(3, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplicationStrategy() {
        double expected = 6;
        Calculation_Strategy multiplication_strategy = new Multiplication();
        Strategy_Context strategyContext = new Strategy_Context(multiplication_strategy);
        double result = strategyContext.execute_calculation_strategy(3, 2);
        assertEquals(expected, result);
    }

    
}