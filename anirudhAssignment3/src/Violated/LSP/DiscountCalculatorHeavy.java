package Violated.LSP;

public class DiscountCalculatorHeavy extends DiscountCalculator {
    protected double calcDiscount(double subtotal, int extra){return subtotal * 0.65 - extra;}
    //Violated because I added a new parameter, thus violating LSP,
    // the `extra` parameter also changes the expected behaviour from the parent class a bit
}
