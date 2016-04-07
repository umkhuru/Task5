package za.ac.cput.oop.domaintests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.RentalFactory;
import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.factories.Impl.RentalFactoryImpl;

/**
 * Created by Ethon on 4/1/2016.
 */
public class RentalTest {

    private RentalFactory factory;

    @Before
    public void setUp() throws Exception
    {
        factory = RentalFactoryImpl.getInstance();
    }

    @Test
    public void testCreateRenatal() throws Exception
    {
        Rental rental = factory.createRental("01-04-2016", "28-04-2016", null);

        Assert.assertEquals("28-04-2016", rental.getReturnDate());
    }

    @Test
    public void testUpdateRental() throws Exception
    {
        Rental rental = factory.createRental("01-04-2016", "28-04-2016", null);

        Rental newRental = new Rental.Builder(rental.getPickUpDate())
                .copy(rental)
                .returnDate("30-04-2016")
                .build();

        Assert.assertEquals("28-04-2016", rental.getReturnDate());
        Assert.assertEquals("30-04-2016", newRental.getReturnDate());
    }
}
