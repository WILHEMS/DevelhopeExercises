package co.develhope.introduction;

public class Test {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
        int res = b * (b+1);
        if(b % 2 != 0 && res % 3 == 0){
            System.out.println("Both statements are true");
        }
        else
            System.out.println("Either one or both statements are false");
    }

}
