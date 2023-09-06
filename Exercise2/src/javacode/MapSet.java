package javacode;

import java.lang.reflect.Array;
import java.util.*;

public class MapSet {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("January",1);
        months.put("February",2);
        months.put("March",3);
        months.put("April",4);
        months.put("May",5);
        months.put("June",6);
        months.put("July",7);
        months.put("August",8);
        months.put("September",9);
        months.put("October",10);
        months.put("November",11);
        months.put("December",12);

        System.out.println("Set view of keys :"+ months.keySet());

        List<Integer> cardinalMonth = new ArrayList<Integer>(months.values());

        System.out.println("The list is :"+ cardinalMonth);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);

        System.out.println("The array is : "+ Arrays.toString(cardinalMonthArray));
    }

}
