package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.factories.CustomerFactory;

import java.util.List;

/**
 * Created by Ethon on 4/6/2016.
 */
public class CustomerFactoryImpl implements CustomerFactory {

    private static CustomerFactoryImpl factory = null;

    private  CustomerFactoryImpl() {
    }
    public static CustomerFactoryImpl getInstance(){
        if(factory ==null)
            factory = new CustomerFactoryImpl();
        return factory;
    }

    public Customer createCustomer(String firstName, String lastName, String phoneNumber, String Address, String City,
                                          String postalCode,
                                          String username, String password, List<Rental> rentals)
    {
        Customer customer = new Customer
                .Builder(lastName)
                .firstName(firstName)
                .phoneNumber(phoneNumber)
                //.addressEmbeddable(AddressEmbeddableFactory.Addressfactory(Address, City, postalCode))
                //.loginEmbeddable(LoginEmbeddableFactory.createLogin(username, password))
                .rentals(rentals)
                .build();
        return customer;
    }
}
