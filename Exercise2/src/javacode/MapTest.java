package javacode;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {

        HashMap<Integer,String> numbers = new HashMap<>();
        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(3,"Three");
        numbers.put(4,"Four");
        numbers.put(5,"Five");

        HashMap<Integer,String> numbersItalian = new HashMap<>();
        numbersItalian.put(1,"Uno");
        numbersItalian.put(3,"Tre");
        numbersItalian.put(5,"Cinque");
        numbersItalian.put(7,"Sette");
        numbersItalian.put(9,"Nove");

        numbers.putAll(numbersItalian);

        for (int i = 5; i < 10; i++) {
            if (numbers.containsKey(i)) {
                System.out.println("Value for "+ i +" is "+ numbers.get(i).toString());
            }
            else {
                System.out.println("No associated value for "+i);
            }
        }
    }
}
