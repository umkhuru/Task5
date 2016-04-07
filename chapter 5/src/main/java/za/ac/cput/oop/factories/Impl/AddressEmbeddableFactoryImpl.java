package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.AddressEmbeddable;
import za.ac.cput.oop.factories.AddressEmbeddableFactory;

/**
 * Created by Ethon on 4/7/2016.
 */
public class AddressEmbeddableFactoryImpl implements AddressEmbeddableFactory {

    private static AddressEmbeddableFactoryImpl factory = null;

    private  AddressEmbeddableFactoryImpl() {
    }
    public static AddressEmbeddableFactoryImpl getInstance(){
        if(factory ==null)
            factory = new AddressEmbeddableFactoryImpl();
        return factory;
    }

    public AddressEmbeddable createAddress(String Address, String City, String postalCode)
    {
        AddressEmbeddable addressEmbeddable = new AddressEmbeddable
                .Builder(Address)
                .City(City)
                .postalCode(postalCode)
                .build();

        return addressEmbeddable;
    }
}
