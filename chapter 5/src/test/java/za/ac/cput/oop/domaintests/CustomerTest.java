package za.ac.cput.oop.domaintests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.CustomerFactory;
import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.factories.Impl.CustomerFactoryImpl;

/**
 * Created by Ethon on 4/1/2016.
 */
public class CustomerTest {

    private CustomerFactory factory;
    @Before
    public void setUp() throws Exception
    {
        factory = CustomerFactoryImpl.getInstance();
    }

    @Test
    public void testCreateCustomer() throws Exception
    {
        Customer customer = factory.createCustomer("Ramakhutla", "Ethon", "0766651268", "12 de jong straat", "Springbok", "8200", "eethon", "rramakhutla", null);
        Assert.assertEquals("Ramakhutla", customer.getFirstName());
    }

    @Test
    public void testUpdateCustomer() throws Exception
    {
        Customer customer = factory.createCustomer("Ramakhutla", "Ethon", "0766651268", "12 de jong straat", "Springbok", "8200", "eethon", "rramakhutla", null);

        Customer newCustomer = new Customer.Builder(customer.getLastName())
                .copy(customer)
                .phoneNumber("0813817755")
                .build();

        Assert.assertEquals("0766651268", customer.getPhoneNumber());
        Assert.assertEquals("0813817755", newCustomer.getPhoneNumber());
    }
}
