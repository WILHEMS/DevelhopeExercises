package co.develhope.introduction;

public class OddEven {
    public static void main(String[] args) {
        String myName = "Bolton";
        if(myName.length() % 2 == 0 && myName.length() > 0){
            System.out.println("Number of letters in my name are Even");
        } else if (myName.length() % 2 != 0 && myName.length() > 0) {
            System.out.println("Number of letters in my name are Odd");
        } else {
            System.out.println("Empty Name Input");
        }
    }
}
