package co.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLists {
        public static void main (String[]args){
            try{
            String[] cities = {"New York", "Nairobi", "Chicago"};
            List<String> cityNames = Arrays.asList(cities);
            System.out.println(cityNames);
            //Adding a fourth city name at the end of the list.
                //Throws an Operation Not Supported Exception
                //cityNames.add("Kisumu");
                cityNames.set(1, " Tegucigalpa ");
                System.out.println(cityNames);

    }catch (NullPointerException e){
                System.out.println("Exception thrown : "+e);
            }
            try{
                List<String> kingsOfRome = new ArrayList<>();
                kingsOfRome.add("Romulus");
                kingsOfRome.add("Numa Pompilius");
                kingsOfRome.add("Tullus Hostilius");
                kingsOfRome.add("Ancus Marcius");
                kingsOfRome.add("Lucius Tarquinius Priscus");
                kingsOfRome.add("Servius Tullius");
                kingsOfRome.add("Lucius Tarquinius Superbus");
                System.out.println(kingsOfRome);

                String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

                kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

                System.out.println(kingsOfRomeArray[6]);

                for (String x : kingsOfRomeArray) {
                    System.out.print(x + " ");
                }
            }catch (NullPointerException e){
                System.out.println("Exception thrown : "+e);
            }
    }
}
