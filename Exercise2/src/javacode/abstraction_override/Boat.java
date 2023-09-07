package javacode.abstraction_override;

public class Boat extends Vehicle{

    public Double maxKnotsSpeed;
    public Integer boatKilosWeight;

    public Boat(String type, Integer numberOfWheels) {
        super(type, numberOfWheels);
    }

    public Boat(Double maxSpeed, Integer weight) {
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    void doVehicleSound() {

    }
    public String  getBoatWeightAndSpeed(){
        return "The total Kilo weight of boat is "+ this.boatKilosWeight+" and the max speed is "+this.maxKnotsSpeed;
    }
}
