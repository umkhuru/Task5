package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.EngineSizeEmbeddable;
import za.ac.cput.oop.factories.EngineSizeFactory;

/**
 * Created by Ethon on 4/7/2016.
 */
public class EngineSizeFactoryImpl implements EngineSizeFactory {

    private static EngineSizeFactoryImpl factory = null;

    private  EngineSizeFactoryImpl() {
    }
    public static EngineSizeFactoryImpl getInstance(){
        if(factory ==null)
            factory = new EngineSizeFactoryImpl();
        return factory;
    }

    public EngineSizeEmbeddable createEngineSizeEmbeddable(String EngineSerialNumber, String EngineSize, String FuelType)
    {
        EngineSizeEmbeddable engineSizeEmbeddable = new EngineSizeEmbeddable
                .Builder(EngineSerialNumber)
                .EngineSize(EngineSize)
                .FuelType(FuelType)
                .build();

        return engineSizeEmbeddable;
    }
}
