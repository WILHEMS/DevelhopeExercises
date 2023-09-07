package javacode.abstraction_override;

public class Car extends Vehicle{
    public Integer numberOfDoors;
    public Double carPrice;
    public Car(String type, Integer numberOfWheels) {
        super(type, numberOfWheels);
    }

    @Override
    void doVehicleSound() {

    }
    void showVehicleDetails(){
        System.out.println("Cars number of doors are :"+ numberOfDoors);
    }

    public Car(Integer wheels, Integer doors, Double price) {
        this.numberOfWheels = wheels;
        this.type = "Car";
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
