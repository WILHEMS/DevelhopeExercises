package Revision;

import java.time.LocalDate;

public class CompareDates {
    static LocalDate date1 = LocalDate.now();
    static LocalDate date2 = LocalDate.of(2021, 6,12);

    public static void main(String[] args) {
        //It returns the value 0 if the argument Date is equal to this Date.
        System.out.println(date1.compareTo(date1));

        //It returns a value less than 0 if this Date is before the Date argument.
        System.out.println(date2.compareTo(date1));

        //It returns a value greater than 0 if this Date is after the Date argument.
        System.out.println(date1.compareTo(date2));
    }
}
