package za.ac.cput.oop.domaintests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.SalesPersonFactory;
import za.ac.cput.oop.domain.SalesPerson;
import za.ac.cput.oop.factories.Impl.SalesPersonFactoryImpl;

/**
 * Created by Ethon on 4/1/2016.
 */
public class SalesPersonTest {

    private SalesPersonFactory factory;

    @Before
    public void setUp() throws Exception
    {
        factory = SalesPersonFactoryImpl.getInstance();
    }

    @Test
    public void testCreateSalesPerson() throws Exception
    {
        SalesPerson salesPerson= factory.createSalesPerson("Ethon", "Owen", 9, 300.00, "pethon", "pj200K", null);

        Assert.assertEquals("Owen", salesPerson.getLastName());
    }

    @Test
    public void testUpdateSalesPerson() throws Exception
    {
        SalesPerson salesPerson= factory.createSalesPerson("Ethon", "Owen", 9, 300.00, "pethon", "pj200K", null);

        SalesPerson newSalesPerson = new SalesPerson.Builder(salesPerson.getLastName())
                .copy(salesPerson)
                .firstName("Dillin")
                .build();

        Assert.assertEquals("Ethon", salesPerson.getFirstName());
        Assert.assertEquals("Dillin", newSalesPerson.getFirstName());
    }
}
