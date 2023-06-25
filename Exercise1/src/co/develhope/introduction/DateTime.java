package co.develhope.introduction;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        //Days left till end month
        System.out.println("Days left till end month : "+(localDate.lengthOfMonth() - localDate.getDayOfMonth()));

        //Days left till end of year
        System.out.println("Days left till end of year : "+(localDate.lengthOfYear() - localDate.getDayOfYear()));

    }

}
