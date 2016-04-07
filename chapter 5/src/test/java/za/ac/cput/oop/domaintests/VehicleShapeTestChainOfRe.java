package za.ac.cput.oop.domaintests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.factories.VehicleShapeFactoryChainOfRe;

/**
 * Created by Ethon on 4/7/2016.
 */
public class VehicleShapeTestChainOfRe {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testcreatevehicleshape() throws Exception {

        String shape = VehicleShapeFactoryChainOfRe.getVehicleShape(60);
        System.out.println("The car you have is the  "+shape);

    }

    @Test
    public void testupdatevehicleshape() throws Exception {

    }

    @After
    public void tearDown() throws Exception {


    }
}
