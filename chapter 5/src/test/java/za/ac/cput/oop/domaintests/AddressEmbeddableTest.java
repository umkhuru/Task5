package za.ac.cput.oop.domaintests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.domain.AddressEmbeddable;
import za.ac.cput.oop.factories.AddressEmbeddableFactory;
import za.ac.cput.oop.factories.Impl.AddressEmbeddableFactoryImpl;

/**
 * Created by Ethon on 4/7/2016.
 */
public class AddressEmbeddableTest {

    private AddressEmbeddableFactory factory;

    @Before
    public void setUp() throws Exception {

        factory = AddressEmbeddableFactoryImpl.getInstance();

    }

    @Test
    public void testcreateAddress() throws Exception {

        AddressEmbeddable address = factory.createAddress("E15-9th AVE", "Oranjemund", "9000");
        Assert.assertEquals("E15-9th AVE", address.getAddress());
        Assert.assertEquals("Oranjemund", address.getCity());
        Assert.assertEquals("9000", address.getPostalCode());

    }

    @Test
    public void testupdateAddress() throws Exception {

        AddressEmbeddable address = factory.createAddress("E15-9th AVE", "Oranjemund", "9000");

        AddressEmbeddable newaddress = new AddressEmbeddable.Builder(address.getCity())
                .copy(address)
                .postalCode("8000")
                .build();

        Assert.assertEquals("9000", address.getPostalCode());
        Assert.assertEquals("8000", newaddress.getPostalCode());

    }

    @After
    public void tearDown() throws Exception {


    }
}
