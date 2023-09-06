package javacode;

import java.io.IOException;

public class HandlingExceptions {
    public static void main(String[] args){
        try {
            checkScore(50.00);
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
    }
    public static void checkScore(Double score) throws ArithmeticException{
        if(score > 0 && score <= 50.00){
            System.out.println("Average Score");
        }
        else if(score > 50.00 && score <= 100.00){
            System.out.println("Very good Score");
        }
        else {
            throw new ArithmeticException("Score is out of scale");
        }
    }
}
