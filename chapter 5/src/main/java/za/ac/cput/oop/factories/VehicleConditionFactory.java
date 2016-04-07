package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.VehicleConditionEmbeddable;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface VehicleConditionFactory {

    VehicleConditionEmbeddable createAddress(String RefcounterReading, String Gas, String MotorCondition);

}
