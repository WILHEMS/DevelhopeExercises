package javacode;

public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public static void main(String[] args) {
        for (int i = 0; i < Month.values().length; i++) {
            if(Month.values()[i].toString().endsWith("Y")){
                System.out.println(Month.values()[i]);
                System.out.println("Ends with Y");
            }
            else {
                System.out.println(Month.values()[i]);
                System.out.println("Doesn't end with Y");
            }
        }

        }
}
