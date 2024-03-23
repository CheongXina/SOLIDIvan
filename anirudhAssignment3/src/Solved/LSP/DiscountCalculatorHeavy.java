package Solved.LSP;

public class DiscountCalculatorHeavy extends DiscountCalculator {
    @Override
    protected double calcDiscount(double subtotal){
        return subtotal * 0.65;
    }
}
