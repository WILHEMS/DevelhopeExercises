package classObjects;

public class Programmer {
    public static String name;
    public Integer age;
    public boolean wearGlasses;
    public static void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }
    public void printDetails(){
        System.out.println("Name is "+ name + " age is "+ age);
    }
    public void hasGlasses(){
        System.out.println("Is "+name+" wearing Glasses? "+wearGlasses);
    }
}
