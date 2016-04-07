package za.ac.cput.oop.domain;

import java.io.Serializable;
import java.util.List;
/**
 * Created by Ethon on 3/30/2016.
 */
public class Rental implements Serializable{

    private Long id;
    private String pickUpDate;
    private String returnDate;
    private List<PaymentMethod> paymentMethod;

    private Rental() {

    }

    public Rental(Builder builder) {
        this.id = builder.id;
        this.pickUpDate = builder.pickUpDate;
        this.returnDate = builder.returnDate;
        this.paymentMethod = builder.paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public List<PaymentMethod> getPaymentMethod() {
        return paymentMethod;
    }


    public static class Builder {
        private Long id;
        private String pickUpDate;
        private String returnDate;
        private List<PaymentMethod> paymentMethod;


        public Builder(String pickUpDate) {
            this.pickUpDate = pickUpDate;
        }

        public Builder returnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder paymentMethod(List<PaymentMethod> paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder copy(Rental rental) {
            this.id = rental.id;
            this.pickUpDate = rental.pickUpDate;
            this.returnDate = rental.returnDate;
            this.paymentMethod = rental.paymentMethod;

            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rental rental = (Rental) o;

        if (id != null ? !id.equals(rental.id) : rental.id != null) return false;
        if (pickUpDate != null ? !pickUpDate.equals(rental.pickUpDate) : rental.pickUpDate != null) return false;
        if (returnDate != null ? !returnDate.equals(rental.returnDate) : rental.returnDate != null) return false;
        return paymentMethod != null ? paymentMethod.equals(rental.paymentMethod) : rental.paymentMethod == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pickUpDate != null ? pickUpDate.hashCode() : 0);
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        return result;
    }
}
