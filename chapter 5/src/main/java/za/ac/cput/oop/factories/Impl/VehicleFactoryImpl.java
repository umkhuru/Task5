package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.domain.Vehicle;
import za.ac.cput.oop.factories.VehicleFactory;

import java.util.List;

/**
 * Created by Ethon on 4/7/2016.
 */
public class VehicleFactoryImpl implements VehicleFactory {

    private static VehicleFactoryImpl factory = null;

    private  VehicleFactoryImpl() {
    }
    public static VehicleFactoryImpl getInstance(){
        if(factory ==null)
            factory = new VehicleFactoryImpl();
        return factory;
    }

    public Vehicle createVehicle(String SerialNumber, String Make, String Model, String year,
                                        String RefcounterReading, String Gas, String MotorCondition,
                                        String EngineSerialNumber, String EngineSize, String FuelType,
                                        List<Rental> rentals)
    {
        Vehicle vehicle = new Vehicle
                .Builder(SerialNumber)
                .Make(Make)
                .Model(Model)
                .year(year)
                //.vehicleCondition(VehicleConditionFactory.createAddress(RefcounterReading, Gas, MotorCondition))
                //.engineSizeEmbeddable(EngineSizeFactory.createEngineSizeEmbeddable(EngineSerialNumber, EngineSize, FuelType))
                .rentals(rentals)
                .build();

        return vehicle;
    }
}
