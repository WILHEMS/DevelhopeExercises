package javacode.method_override;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    public String priceType;
    public Double priceInEuros;

    public SmartphonePrice(String type, Double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Objects.equals(priceType, that.priceType) && Objects.equals(priceInEuros, that.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
