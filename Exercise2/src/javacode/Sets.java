package javacode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Hashset
        HashSet<String> weekDaysH = new HashSet<String>();
        weekDaysH.add("Sunday");
        weekDaysH.add("Monday");
        weekDaysH.add("Tuesday");
        weekDaysH.add("Wednesday");
        weekDaysH.add("Thursday");
        weekDaysH.add("Friday");
        weekDaysH.add("Saturday");

        System.out.println("Contents of week days hashset");
        System.out.println(weekDaysH);

        //Tree Set
        TreeSet<String> weekDaysT = new TreeSet<String>();
        weekDaysT.add("Sunday");
        weekDaysT.add("Monday");
        weekDaysT.add("Tuesday");
        weekDaysT.add("Wednesday");
        weekDaysT.add("Thursday");
        weekDaysT.add("Friday");
        weekDaysT.add("Saturday");

        System.out.println("Contents of week days Treeset");
        System.out.println(weekDaysT);

        //Linked Hash set
        LinkedHashSet<String> weekDaysL = new LinkedHashSet<String>();
        weekDaysL.add("Sunday");
        weekDaysL.add("Monday");
        weekDaysL.add("Tuesday");
        weekDaysL.add("Wednesday");
        weekDaysL.add("Thursday");
        weekDaysL.add("Friday");
        weekDaysL.add("Saturday");

        System.out.println("Contents of week days Linked Hash set");
        System.out.println(weekDaysL);

        //Checking if the Linked hashset and HashSet are equal
        System.out.println("Checking if the Linked hashset and HashSet are equal");
        System.out.println("No they are not equal");

    }

}
