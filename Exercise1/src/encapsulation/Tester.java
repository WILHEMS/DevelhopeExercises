package encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        House house = new House();
        Scanner inputFloors = new Scanner(System.in);
        System.out.println("Enter the floorNumbers : ");

        house.setFloorsNumber(inputFloors.nextInt());

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter the address : ");
        house.setAddress(inputAddress.nextLine());

        Scanner inputResidentNames = new Scanner(System.in);
        System.out.println("Enter the names of the residents separated by a comma :");
        house.setResidentsNames(inputResidentNames.nextLine());

        System.out.println("The Number of floors is "+ house.getFloorsNumber());
        System.out.println("The address of the house is :"+ house.getAddress());
        System.out.println("The resident names are "+ Arrays.asList(house.getResidentsNames()));


    }
}
