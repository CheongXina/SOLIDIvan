package Violated.LSP;

public class DiscountCalculator {

    protected double calcDiscount(double subtotal){
        return subtotal * 0.85;
    }
    protected double calcDiscountLight(double subtotal){
        return subtotal * 0.95;
    }
    protected double calcDiscountHeavy(double subtotal){
        return subtotal * 0.65;
    }
}
