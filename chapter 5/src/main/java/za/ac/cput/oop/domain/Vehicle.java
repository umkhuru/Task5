package za.ac.cput.oop.domain;

import java.io.Serializable;
import java.util.List;


/**
 * Created by Ethon on 3/30/2016.
 */

public class Vehicle implements Serializable{

    private Long id;
    private String SerialNumber;
    private String Make;
    private String Model;
    private String year;
    private VehicleConditionEmbeddable vehicleConditionEmbeddable;
    private EngineSizeEmbeddable engineSizeEmbeddable;
    private List<Rental> rentals;

    private Vehicle() {

    }

    public Vehicle(Builder builder) {
        this.id = builder.id;
        this.SerialNumber = builder.SerialNumber;
        this.Make = builder.Make;
        this.Model = builder.Model;
        this.year = builder.year;
        this.vehicleConditionEmbeddable = builder.vehicleConditionEmbeddable;
        this.engineSizeEmbeddable = builder.engineSizeEmbeddable;
        this.rentals = builder.rentals;
    }

    public Long getId() {
        return id;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public String getYear() {
        return year;
    }

    public VehicleConditionEmbeddable getVehicleConditionEmbeddable() {
        return vehicleConditionEmbeddable;
    }

    public EngineSizeEmbeddable getEngineSizeEmbeddable() {
        return engineSizeEmbeddable;
    }

    public List<Rental> getRentals() {
        return rentals;
    }


    public static class Builder {
        private Long id;
        private String SerialNumber;
        private String Make;
        private String Model;
        private String year;
        private VehicleConditionEmbeddable vehicleConditionEmbeddable;
        // private MotorCycleStatusEmbeddable motorCycleStatusEmbeddable;
        private EngineSizeEmbeddable engineSizeEmbeddable;
        private List<Rental> rentals;

        public Builder(String SerialNumber) {
            this.SerialNumber = SerialNumber;
        }

        public Builder Make(String Make) {
            this.Make = Make;
            return this;
        }

        public Builder Model(String Model) {
            this.Model = Model;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder vehicleCondition(VehicleConditionEmbeddable vehicleConditionEmbeddable) {
            this.vehicleConditionEmbeddable = vehicleConditionEmbeddable;
            return this;
        }

        public Builder engineSizeEmbeddable(EngineSizeEmbeddable engineSizeEmbeddable) {
            this.engineSizeEmbeddable = engineSizeEmbeddable;
            return this;
        }

        public Builder rentals(List<Rental> rentals) {
            this.rentals = rentals;
            return this;
        }

        public Builder copy(Vehicle vehicle) {
            this.id = vehicle.id;
            this.SerialNumber = vehicle.SerialNumber;
            this.Make = vehicle.Make;
            this.Model = vehicle.Model;
            this.year = vehicle.year;
            this.vehicleConditionEmbeddable = vehicle.vehicleConditionEmbeddable;
            this.engineSizeEmbeddable = vehicle.engineSizeEmbeddable;
            this.rentals = vehicle.rentals;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (id != null ? !id.equals(vehicle.id) : vehicle.id != null) return false;
        if (SerialNumber != null ? !SerialNumber.equals(vehicle.SerialNumber) : vehicle.SerialNumber != null)
            return false;
        if (Make != null ? !Make.equals(vehicle.Make) : vehicle.Make != null) return false;
        if (Model != null ? !Model.equals(vehicle.Model) : vehicle.Model != null) return false;
        if (year != null ? !year.equals(vehicle.year) : vehicle.year != null) return false;
        if (vehicleConditionEmbeddable != null ? !vehicleConditionEmbeddable.equals(vehicle.vehicleConditionEmbeddable) : vehicle.vehicleConditionEmbeddable != null)
            return false;
        if (engineSizeEmbeddable != null ? !engineSizeEmbeddable.equals(vehicle.engineSizeEmbeddable) : vehicle.engineSizeEmbeddable != null)
            return false;
        return rentals != null ? rentals.equals(vehicle.rentals) : vehicle.rentals == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (SerialNumber != null ? SerialNumber.hashCode() : 0);
        result = 31 * result + (Make != null ? Make.hashCode() : 0);
        result = 31 * result + (Model != null ? Model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (vehicleConditionEmbeddable != null ? vehicleConditionEmbeddable.hashCode() : 0);
        result = 31 * result + (engineSizeEmbeddable != null ? engineSizeEmbeddable.hashCode() : 0);
        result = 31 * result + (rentals != null ? rentals.hashCode() : 0);
        return result;
    }
}
