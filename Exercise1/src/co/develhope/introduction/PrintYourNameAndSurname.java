package co.develhope.introduction;

import java.util.Scanner;

public class PrintYourNameAndSurname {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = myName.nextLine();
        Scanner mySurname = new Scanner(System.in);
        System.out.println("Enter your Surname");
        String yourSurname = mySurname.nextLine();
        System.out.println("Your name is " + yourName +" "+yourSurname);
    }
}