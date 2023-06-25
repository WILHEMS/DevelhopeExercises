package classObjects;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer first = new Programmer();
        Programmer second = new Programmer();
        first.name = "Bolton";
        first.age = 23;
        first.wearGlasses = true;
        second.name = "Derick";
        second.age = 24;
        second.wearGlasses = false;
        first.drinkCoffe();
        first.printDetails();
        second.printDetails();
        second.hasGlasses();
    }
}
