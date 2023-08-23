package Revision;

import java.lang.reflect.Method;

/**
 *
 */
public class Constructor {
        static Double maxCash = 100000.0;
        Double cashAnnuity = 12000.0;
        Constructor(Double maxBal){
            maxCash = maxBal;
        }

    /**
     * @param maxCheck
     * @return
     */
        public Double Method1(Double maxCheck){

           // maxCash = maxCheck;
            System.out.println(cashAnnuity);
            System.out.println(maxCash);

            return maxCash;

    }

    /**
     *
     */
    static  void AnnuityCheck(){
        //System.out.println(cashAnnuity);
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        AnnuityCheck();
        Constructor constructor = new Constructor(13.0);
        constructor.Method1(12.0);
    }
}


/**
 * Inheritance
 */
class Extender extends Constructor{
    Extender(Double maxBal) {
        super(maxBal);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(maxCash);
    }
}
