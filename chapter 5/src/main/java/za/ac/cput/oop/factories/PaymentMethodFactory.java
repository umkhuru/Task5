package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.PaymentMethod;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface PaymentMethodFactory {

    PaymentMethod createPaymentMethod(String PaymentType, double Price);
}
