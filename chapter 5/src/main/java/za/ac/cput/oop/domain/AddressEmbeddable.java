package za.ac.cput.oop.domain;

import java.io.Serializable;


/**
 * Created by Ethon on 3/30/2016.
 */

public class AddressEmbeddable implements Serializable {

    private String Address;
    private String City;
    private String postalCode;

    //constructors
    public AddressEmbeddable()
    {

    }

    public AddressEmbeddable (Builder builder)
    {
        this.Address = builder.Address;
        this.City = builder.City;
        this.postalCode = builder.postalCode;
    }

    //Getters
    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static class Builder
    {
        private String Address;
        private String City;
        private String postalCode;

        public Builder(String Address)
        {
            this.Address = Address;
        }

        public Builder City(String City)
        {
            this.City = City;
            return this;
        }

        public Builder postalCode(String postalCode)
        {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(AddressEmbeddable addressEmbeddable)
        {
            this.Address = addressEmbeddable.Address;
            this.City = addressEmbeddable.City;
            this.postalCode = addressEmbeddable.postalCode;
            return this;
        }

        public AddressEmbeddable build()
        {
            return new AddressEmbeddable(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEmbeddable that = (AddressEmbeddable) o;

        if (Address != null ? !Address.equals(that.Address) : that.Address != null) return false;
        if (City != null ? !City.equals(that.City) : that.City != null) return false;
        return postalCode != null ? postalCode.equals(that.postalCode) : that.postalCode == null;

    }

    @Override
    public int hashCode() {
        int result = Address != null ? Address.hashCode() : 0;
        result = 31 * result + (City != null ? City.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
