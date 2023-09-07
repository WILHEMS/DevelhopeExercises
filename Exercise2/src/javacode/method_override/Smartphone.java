package javacode.method_override;

import java.util.Objects;

public class Smartphone implements Cloneable{
    String brandName;
    String modelName;
    Integer batterymAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice ;

    public Smartphone(String brand, String model, Integer battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(batterymAh, that.batterymAh) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        this.producerPrice = clonedSmartphone.producerPrice;
        this.retailPrice = clonedSmartphone.retailPrice;
        return clonedSmartphone;
    }
}
