package javadoc;

/**
 * Word Games class to instantiate variables and create two methods
 * addHelloWord
 * getFullName
 *
 *  Author Bolton Derick
 */
public class WordGames {
    String name;
    String surname;

    /**
     * Method to add Hello to the word given
     * @param word
     * @return hello and the given word
     */
    public String addHelloWord(String word){
        return "Hello "+ word;
    }

    /**
     * Does not take any parameters
     * @return concatenation of name and surname
     */
    public String getFullName(){
        return name + " " + surname;
    }

    /**
     * A constructor method for class WordGames
     * @param name
     * @param surname
     * has no return
     */
    public WordGames(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
