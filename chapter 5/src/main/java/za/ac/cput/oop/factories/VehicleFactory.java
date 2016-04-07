package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.domain.Vehicle;

import java.util.List;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface VehicleFactory {

    Vehicle createVehicle(String SerialNumber, String Make, String Model, String year,
                                              String RefcounterReading, String Gas, String MotorCondition,
                                           String EngineSerialNumber, String EngineSize, String FuelType,
                                           List<Rental> rentals);

}
