package javadoc;

/**
 * Tester class to create word games object and invoke the two methods
 * addHelloWord
 * getFullName
 *
 * Author Bolton Derick
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames("Bolton", "Derick");
        System.out.println(wordGames.addHelloWord("Student"));
        System.out.println(wordGames.getFullName());
    }
}
