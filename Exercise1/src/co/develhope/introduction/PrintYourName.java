package co.develhope.introduction;
import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = myName.nextLine();
        System.out.println("Your name is "+ yourName);
    }
}
