package javacode.abstraction_override;

public class VehicleTester {
    public static void main(String[] args) {
        Car car = new Car(4,4,2000.00);
        Boat boat = new Boat(450.0,300);

        System.out.println("Car Details");
        car.showVehicleDetails();
        boat.getBoatWeightAndSpeed();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}

