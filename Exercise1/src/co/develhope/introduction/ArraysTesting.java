package co.develhope.introduction;

public class ArraysTesting {
    public static void main(String[] args) {
        String[] carBrands = {"Porsche", "Tesla", "Subaru", "BMW", "Lexus"};
        System.out.println(carBrands.length);
        System.out.println("The third item is " + carBrands[2]);
        int[] primeNumbers = new int[6];

        //Variable declared to check current filled position in array primeNumbers
        Integer checkPos = 0;

        //Declare variable to check if it's prime and increase after every check
        //Loop runs as long as array length is greater than the current filled position
        for (int checkNum = 0; checkPos < primeNumbers.length; checkNum++) {
            if (checkPrime(checkNum) == true){
                primeNumbers[checkPos] = checkNum;
                checkPos++;
            }
        }
        //Loop to rpint all elements of array
        System.out.println(primeNumbers[0]+ " "+primeNumbers[1]+ " "+primeNumbers[2]+ " "+primeNumbers[3]+ " "+primeNumbers[4]+ " "+primeNumbers[5]+ " ");

    }
    //Method to check if a given number is prime
    public static boolean checkPrime(int n){
        //Since 0 and 1 is not prime return false
        if (n==1 || n == 0){
            return false;
        } else if (n > 1) {
            for (int i = 2;i<n;i++){
                if (n % i == 0){
                    return false;
                }

            }

        }
        //default to return true
        return true;
    }
}
