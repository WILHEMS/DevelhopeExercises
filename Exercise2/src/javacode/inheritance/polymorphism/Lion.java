package javacode.inheritance.polymorphism;

public class Lion extends Animal {
    public String sound = "grrr";
    public Lion(String animalName) {
        super(animalName);
    }
    public void animalSound(){
        System.out.println("Animal sound is "+sound);
    }
}
