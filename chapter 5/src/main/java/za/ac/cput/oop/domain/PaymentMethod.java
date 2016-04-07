package za.ac.cput.oop.domain;


import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by Ethon on 3/30/2016.
 */

public class PaymentMethod implements Serializable{

    private Long id;
    private String PaymentType;
    private double Price;

    private PaymentMethod()

    {

    }

    public PaymentMethod(Builder builder) {
        this.id = builder.id;
        this.PaymentType = builder.PaymentType;
        this.Price = builder.Price;
    }

    public Long getId() {
        return id;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public double getPrice() {
        return Price;
    }


    public static class Builder {
        private Long id;
        private String PaymentType;
        private double Price;

        public Builder(String PaymentType) {
            this.PaymentType = PaymentType;
        }

        public Builder Price(double Price) {
            this.Price = Price;
            return this;
        }


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder copy(PaymentMethod paymentMethod) {
            this.id = paymentMethod.id;
            this.PaymentType = paymentMethod.PaymentType;
            this.Price = paymentMethod.Price;
            return this;
        }

        public PaymentMethod build() {
            return new PaymentMethod(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentMethod that = (PaymentMethod) o;

        if (Double.compare(that.Price, Price) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return PaymentType != null ? PaymentType.equals(that.PaymentType) : that.PaymentType == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (PaymentType != null ? PaymentType.hashCode() : 0);
        temp = Double.doubleToLongBits(Price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
