package javacode.abstraction_override;

abstract class Vehicle {
    public String type;
    public Integer numberOfWheels;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle(String type, Integer numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle() {
    }

    void showVehicleDetails(){
        System.out.println("The type of vehicle is "+type+" the number of wheels is "+numberOfWheels);
    }
    abstract void doVehicleSound();
}
