package javacode;

import java.io.IOException;

public class HandlingExceptions {
    public static void main(String[] args){
        try {
            checkScore(101.00);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    public static void checkScore(Double score) throws IOException{
        if(score > 0 && score <= 50.00){
            System.out.println("Average Score");
        }
        else if(score > 50.00 && score <= 100.00){
            System.out.println("Very good Score");
        }
        else {
            throw new IOException("Score is out of scale");
        }
    }
}
