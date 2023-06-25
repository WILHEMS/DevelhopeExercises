package co.develhope.introduction;

import classObjects.Programmer;

public class ScopeTest {
    private static String myName = "Bolton";
    private Integer myAge = 23;
    String myOccupation = "Engineering";

    public static void main(String[] args) {
        System.out.println(myName);
        WhileLoop.botBalance = 12000;
        System.out.println(WhileLoop.botBalance);
        ScopeTest scp = new ScopeTest();
        scp.InstanceMethod();

    }
    public void InstanceMethod(){
        Integer k = 20;
        myAge = 12;
        System.out.println(myAge);
        System.out.println(myOccupation);
        for (int i = 0;i<10;i++){
            System.out.println(k);
            Integer b = 201;
            System.out.println(b);
        }
    }
}
