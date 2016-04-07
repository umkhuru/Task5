package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.PaymentMethod;
import za.ac.cput.oop.domain.Rental;

import java.util.List;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface RentalFactory {

    Rental createRental(String pickUpdate, String returnDate, List<PaymentMethod> paymentMethod);

}
