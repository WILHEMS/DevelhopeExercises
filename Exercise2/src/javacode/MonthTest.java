package javacode;

import java.util.Arrays;

import static javacode.Month.*;

public class MonthTest {
    public static void main(String[] args) {



        switch (JANUARY){
            case JANUARY -> System.out.println("Ends with y");
            case FEBRUARY -> System.out.println("Ends with y");
            case MARCH -> System.out.println("Doesn't end with y");
            case APRIL -> System.out.println("Doesn't end with y");
            case MAY -> System.out.println("Ends with y");
            case JUNE -> System.out.println("Doesn't end with y");
            case JULY -> System.out.println("Ends with Y");
            case AUGUST -> System.out.println("Doesn't end with y");
            case SEPTEMBER -> System.out.println("Doesn't end with y");
            case OCTOBER -> System.out.println("Doesn't end with y");
            case NOVEMBER -> System.out.println("Doesn't end with y");
            case DECEMBER -> System.out.println("Doesn't end with y");

            //default -> throw new IllegalStateException("Unexpected value: " + month);
        }
    }
    public static void getMonthType(int month){
        Month months = Month.values()[month];
        switch (months){
            case JANUARY -> System.out.println("Ends with y");
            case FEBRUARY -> System.out.println("Ends with y");
            case MARCH -> System.out.println("Doesn't end with y");
            case APRIL -> System.out.println("Doesn't end with y");
            case MAY -> System.out.println("Ends with y");
            case JUNE -> System.out.println("Doesn't end with y");
            case JULY -> System.out.println("Ends with Y");
            case AUGUST -> System.out.println("Doesn't end with y");
            case SEPTEMBER -> System.out.println("Doesn't end with y");
            case OCTOBER -> System.out.println("Doesn't end with y");
            case NOVEMBER -> System.out.println("Doesn't end with y");
            case DECEMBER -> System.out.println("Doesn't end with y");

            //default -> throw new IllegalStateException("Unexpected value: " + month);
        }
    }
}
