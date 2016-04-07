package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.PaymentMethod;
import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.factories.RentalFactory;

import java.util.List;

/**
 * Created by Ethon on 4/7/2016.
 */
public class RentalFactoryImpl implements RentalFactory {

    private static RentalFactoryImpl factory = null;

    private  RentalFactoryImpl() {
    }
    public static RentalFactoryImpl getInstance(){
        if(factory ==null)
            factory = new RentalFactoryImpl();
        return factory;
    }

    public Rental createRental(String pickUpdate, String returnDate, List<PaymentMethod> paymentMethod)
    {
        Rental rental = new Rental
                .Builder(pickUpdate)
                .returnDate(returnDate)
                .paymentMethod(paymentMethod)
                .build();
        return rental;
    }
}
