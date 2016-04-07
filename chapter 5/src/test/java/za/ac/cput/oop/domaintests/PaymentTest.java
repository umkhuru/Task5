package za.ac.cput.oop.domaintests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.PaymentMethodFactory;
import za.ac.cput.oop.domain.PaymentMethod;
import za.ac.cput.oop.factories.Impl.PaymentMethodFactoryImpl;

/**
 * Created by Ethon on 4/1/2016.
 */
public class PaymentTest {
    private PaymentMethodFactory factory;

    @Before
    public void setUp() throws Exception
    {
        factory = PaymentMethodFactoryImpl.getInstance();
    }

    @Test
    public void testCreatePayment() throws Exception
    {
        PaymentMethod paymentMethod = factory.createPaymentMethod("Credit", 300.00);
        Assert.assertEquals(300.00, paymentMethod.getPrice(), 0.2f);
    }

    @Test
    public void testUpdatePayment() throws Exception
    {
        PaymentMethod paymentMethod = factory.createPaymentMethod("Debit", 300.00);

        PaymentMethod newPaymentMethod = new PaymentMethod.Builder(paymentMethod.getPaymentType())
                .copy(paymentMethod)
                .Price(800.00)
                .build();

        Assert.assertEquals(300.00, paymentMethod.getPrice(), 0.2f);
        Assert.assertEquals(800.00,newPaymentMethod.getPrice(), 0.2f);
    }
}
