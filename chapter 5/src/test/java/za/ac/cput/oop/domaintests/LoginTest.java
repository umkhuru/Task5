package za.ac.cput.oop.domaintests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.oop.domain.LoginEmbeddable;
import za.ac.cput.oop.factories.Impl.LoginEmbeddableFactoryImpl;
import za.ac.cput.oop.factories.LoginEmbeddableFactory;

/**
 * Created by Ethon on 4/7/2016.
 */
public class LoginTest {

    private LoginEmbeddableFactory factory;

    @Before
    public void setUp() throws Exception {

        factory = LoginEmbeddableFactoryImpl.getInstance();


    }

    @Test
    public void testcreatelogin() throws Exception {

        LoginEmbeddable login = factory.createLogin("211162213","123456");
        Assert.assertEquals("211162213",login.getUsername());
        Assert.assertEquals("123456",login.getPassword());

    }

    @Test
    public void testupdatelogin() throws Exception {

        LoginEmbeddable login = factory.createLogin("211162213","123456");

        LoginEmbeddable newlogin = new LoginEmbeddable.Builder(login.getPassword())
                .copy(login)
                .password("123457")
                .build();

        Assert.assertEquals("123456",login.getPassword());
        Assert.assertEquals("123457",newlogin.getPassword());


    }

    @After
    public void tearDown() throws Exception {


    }
}
