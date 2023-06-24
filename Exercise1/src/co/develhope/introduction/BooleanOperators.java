package co.develhope.introduction;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean a = 2 <= 2 && !true;
        System.out.println("2 <= 2 && !true evaluates to "+ a);
        boolean b =  !false && 3 > 2;
        System.out.println(" !false && 3 > 2 evaluates to "+ b);
        boolean d = 6 > 6 ^ !(true && true);
        System.out.println("6 > 6 ^ !(true && true) evaluates to "+ d);
        boolean t = false;
        boolean f = true;
        boolean c = !(!t || f);
        System.out.println("considering that t=false and f=true: !(!t || f) evaluates to "+c);
    }
}
