package co.develhope.introduction;

public class WhileLoop {
    //This class demonstrates the working of a trading bot
    public static void main(String[] args) {
        Integer botBalance = 10000;
        Integer numberOfDays = 0;

        while (botBalance > 0) {

            double dailyRate = 1 + (Math.random() * 0.2);

            System.out.println(dailyRate);

            if (dailyRate > 1.15) {

                System.out.println("Converted");

                double totalEuro = 1000 * dailyRate;
                botBalance = botBalance - 1000;
                System.out.println(botBalance);
                numberOfDays++;

                }
        }
        System.out.println(numberOfDays);
    }
}
