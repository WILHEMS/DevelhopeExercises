package co.develhope.introduction;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        String string1Cut = string1.substring(0,2);
        String string2Cut = string2.substring(string2.length()-2);

        String[] charArray = {string1Cut+string2Cut};
        System.out.println(charArray[0]);
        //System.out.println(Arrays.toString(charArray));
    }
}
