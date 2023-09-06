package javacode.inheritance.polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cow = new Cow("Cow");
        Animal lion = new Lion("Lion");

        animal.animalSound();
        cow.animalSound();
        lion.animalSound();

    }
}
