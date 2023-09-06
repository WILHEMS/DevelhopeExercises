package javacode.inheritance.polymorphism;

public class Cow extends Animal{
    public String sound = "mooo";
    public Cow(String animalName) {
        super(animalName);
    }
    public void animalSound(){
        System.out.println("Animal sound is "+sound);
    }

}
