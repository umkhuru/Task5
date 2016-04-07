package za.ac.cput.oop.domain;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Ethon on 3/30/2016.
 */
public class SalesPerson implements Person, Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private int hours;
    private double rate;
    private List<Customer> customers;

    //constructors
    private SalesPerson()
    {

    }

    public SalesPerson(Builder builder)
    {
        this.id=builder.id;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.hours= builder.hours;
        this.rate=builder.rate;
        this.customers=builder.customers;
    }


    public Long getId() {
        return id;
    }

    //@Override
    public String getFirstName() {
        return firstName;
    }

    //@Override
    public String getLastName() {
        return lastName;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    //getters



    public static class Builder
    {
        private Long id;
        private String firstName;
        private String lastName;
        private int hours;
        private double rate;
        private List<Customer> customers;

        public Builder(String lastName)
        {
            this.lastName = lastName;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder hours(int hours)
        {
            this.hours = hours;
            return this;
        }

        public Builder rate(double rate)
        {
            this.rate = rate;
            return this;
        }


        public Builder customers(List<Customer> customers)
        {
            this.customers = customers;
            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder copy(SalesPerson salesperson)
        {
            this.id = salesperson.id;
            this.firstName = salesperson.firstName;
            this.lastName = salesperson.lastName;
            this.hours = salesperson.hours;
            this.rate = salesperson.rate;
            this.customers = salesperson.customers;

            return this;
        }

        public SalesPerson build()
        {
            return new SalesPerson(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesPerson that = (SalesPerson) o;

        if (hours != that.hours) return false;
        if (Double.compare(that.rate, rate) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return customers != null ? customers.equals(that.customers) : that.customers == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + hours;
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }
}
