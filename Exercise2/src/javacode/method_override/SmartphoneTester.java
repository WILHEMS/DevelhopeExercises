package javacode.method_override;

public class SmartphoneTester {
    public static void main(String[] args) {
        //Smartphoneprice objects
        SmartphonePrice smartphonePriceAP = new SmartphonePrice("Producer", 10000.00);
        SmartphonePrice smartphonePriceAR = new SmartphonePrice("Retail", 15000.00);
        SmartphonePrice smartphonePriceBR = new SmartphonePrice("Producer", 20000.00);
        SmartphonePrice smartphonePriceBP = new SmartphonePrice("Retail", 25000.00);

        //Smartphone objects
        Smartphone smartphone1 = new Smartphone("Nokia","Nokia 6",3000,smartphonePriceAP,smartphonePriceAR);
        Smartphone smartphone2 = new Smartphone("Samsung","Samsung s23",4000,smartphonePriceBP,smartphonePriceBR);

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());
        if(smartphone1.equals(smartphone2)){
            System.out.println("Smartphones are equal");
        }else {
            System.out.println("Smartphones are not equal");
        }

        try{
            Smartphone smartphone3 = (Smartphone) smartphone2.clone();
            System.out.println(smartphone3.toString());
            System.out.println(smartphone3.equals(smartphone2));

        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("An error occured");

        }


    }
}
