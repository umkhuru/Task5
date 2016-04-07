package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.EngineSizeEmbeddable;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface EngineSizeFactory {

    EngineSizeEmbeddable createEngineSizeEmbeddable(String EngineSerialNumber, String EngineSize, String FuelType);
}
