package javacode;

public class SimpleMath {
    public Integer minuend;
    public Integer subtrahend;
    public Integer multiplier;
    public Integer multiplicand;
    public static void main(String[] args) {

    }
    public int subtraction(Integer minuend, Integer subtrahend){
        int ans = minuend - subtrahend;
        return ans;
    }
    public int multiplication(Integer multiplier, Integer multiplicand){
        Integer product = multiplier * multiplicand;
        return product;
    }
}
