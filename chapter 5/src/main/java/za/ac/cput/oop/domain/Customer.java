package za.ac.cput.oop.domain;

import java.io.Serializable;
import java.util.List;
/**
 * Created by Ethon on 3/30/2016.
 */

public class Customer implements Person, Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private AddressEmbeddable addressEmbeddable;
    private LoginEmbeddable loginEmbeddable;
    private List<Rental> rentals;

    //constructors
    private Customer()
    {

    }

    public Customer(Builder builder)
    {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.addressEmbeddable = builder.addressEmbeddable;
        this.loginEmbeddable = builder.loginEmbeddable;
        this.rentals = builder.rentals;
    }

    //getters
    public Long getId() {
        return id;
    }

    //@Override
    public String getFirstName() {
        return firstName;
    }

    //@Override
    public String getLastName() {
        return null;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AddressEmbeddable getAddressEmbeddable() {
        return addressEmbeddable;
    }

    public LoginEmbeddable getLoginEmbeddable() {
        return loginEmbeddable;
    }

    public List<Rental> getRentals() {
        return rentals;
    }


    public static class Builder
    {
        private Long id;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private AddressEmbeddable addressEmbeddable;
        private LoginEmbeddable loginEmbeddable;
        private List<Rental> rentals;

        public Builder(String lastName) {
            this.lastName = lastName;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder addressEmbeddable(AddressEmbeddable addressEmbeddable) {
            this.addressEmbeddable = addressEmbeddable;
            return this;
        }

        public Builder loginEmbeddable(LoginEmbeddable loginEmbeddable) {
            this.loginEmbeddable = loginEmbeddable;
            return this;
        }

        public Builder rentals(List<Rental> rentals) {
            this.rentals = rentals;
            return this;
        }


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder copy(Customer customer)
        {
            this.id = customer.id;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.phoneNumber = customer.phoneNumber;
            this.addressEmbeddable = customer.addressEmbeddable;
            this.loginEmbeddable = customer.loginEmbeddable;
            this.rentals = customer.rentals;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(customer.phoneNumber) : customer.phoneNumber != null)
            return false;
        if (addressEmbeddable != null ? !addressEmbeddable.equals(customer.addressEmbeddable) : customer.addressEmbeddable != null)
            return false;
        if (loginEmbeddable != null ? !loginEmbeddable.equals(customer.loginEmbeddable) : customer.loginEmbeddable != null)
            return false;
        return rentals != null ? rentals.equals(customer.rentals) : customer.rentals == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (addressEmbeddable != null ? addressEmbeddable.hashCode() : 0);
        result = 31 * result + (loginEmbeddable != null ? loginEmbeddable.hashCode() : 0);
        result = 31 * result + (rentals != null ? rentals.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressEmbeddable=" + addressEmbeddable +
                ", loginEmbeddable=" + loginEmbeddable +
                ", rentals=" + rentals +
                '}';
    }
}
