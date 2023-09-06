package javacode.inheritance.polymorphism;

public class Animal {
    public  String animalName;

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public void animalSound(){
        System.out.println("Animal sound is Strange");
    }
}
