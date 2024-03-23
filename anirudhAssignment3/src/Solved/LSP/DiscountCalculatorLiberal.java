package Solved.LSP;

public class DiscountCalculatorLiberal extends DiscountCalculator {

    @Override
    protected double calcDiscount(double subtotal){
        return subtotal * 0.95;
    }
}
