package za.ac.cput.oop.domaintests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.VehicleFactory;
import za.ac.cput.oop.domain.Vehicle;
import za.ac.cput.oop.factories.Impl.VehicleFactoryImpl;

/**
 * Created by Ethon on 4/1/2016.
 */
public class VehicleTest {

    private VehicleFactory factory;

    @Before
    public void setUp() throws Exception
    {
        factory = VehicleFactoryImpl.getInstance();
    }

    @Test
    public void testCreateVehicle() throws Exception
    {
        Vehicle vehicle = factory.createVehicle("BM34AA", "BMW", "3series", "2006", "200km", "full", "Mint ", "600ccsd", "330d", "Diesel ", null);

        Assert.assertEquals("BMW", vehicle.getMake());
    }

    @Test
    public void testUpdateVehicle() throws Exception
    {
        Vehicle vehicle = factory.createVehicle("BM34AA", "BMW", "3series", "2006", "200km", "full", "Mint ", "600ccsd", "330d", "Diesel ", null);

        Vehicle newVehicle = new Vehicle.Builder(vehicle.getSerialNumber())
                .copy(vehicle)
                .Model("5series")
                .build();

        Assert.assertEquals("3series", vehicle.getModel());
        Assert.assertEquals("5series", newVehicle.getModel());
    }
}
