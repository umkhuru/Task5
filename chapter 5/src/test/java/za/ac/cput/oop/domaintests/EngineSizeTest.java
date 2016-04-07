package za.ac.cput.oop.domaintests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import za.ac.cput.oop.domain.EngineSizeEmbeddable;
import za.ac.cput.oop.factories.EngineSizeFactory;
import za.ac.cput.oop.factories.Impl.EngineSizeFactoryImpl;

/**
 * Created by Ethon on 4/7/2016.
 */
public class EngineSizeTest {

    private EngineSizeFactory factory;

    @Before
    public void setUp() throws Exception {

        factory = EngineSizeFactoryImpl.getInstance();

    }

    @Test
    public void testcreateEngineSize() throws Exception {

        EngineSizeEmbeddable engine = factory.createEngineSizeEmbeddable("123", "3L", "petrol");
        Assert.assertEquals("123", engine.getEngineSerialNumber());
        Assert.assertEquals("3L", engine.getEngineSize());
        Assert.assertEquals("petrol", engine.getFuelType());

    }

    @Test
    public void testupdateEngineSize() throws Exception {

        EngineSizeEmbeddable engine = factory.createEngineSizeEmbeddable("123", "3L", "petrol");

        EngineSizeEmbeddable newengine = new EngineSizeEmbeddable.Builder(engine.getFuelType())
                .copy(engine)
                .FuelType("diesel")
                .build();

        Assert.assertEquals("petrol", engine.getFuelType());
        Assert.assertEquals("diesel", newengine.getFuelType());

    }

    @After
    public void tearDown() throws Exception {


    }
}
