package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.domain.Rental;

import java.util.List;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface CustomerFactory {

    Customer createCustomer(String firstName, String lastName, String phoneNumber, String Address, String City,
                                          String postalCode,
                                          String username, String password, List<Rental> rentals);
}
