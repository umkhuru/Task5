package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.AddressEmbeddable;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface AddressEmbeddableFactory {

    AddressEmbeddable createAddress(String Address, String City, String postalCode);
}
