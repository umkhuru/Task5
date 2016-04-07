package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.domain.SalesPerson;
import za.ac.cput.oop.factories.SalesPersonFactory;

import java.util.List;

/**
 * Created by Ethon on 4/7/2016.
 */
public class SalesPersonFactoryImpl implements SalesPersonFactory {

    private static SalesPersonFactoryImpl factory = null;

    private  SalesPersonFactoryImpl() {
    }
    public static SalesPersonFactoryImpl getInstance(){
        if(factory ==null)
            factory = new SalesPersonFactoryImpl();
        return factory;
    }

    public SalesPerson createSalesPerson(String firstName, String lastName, int hours,
                                                double rate, String username, String password, List<Customer> customers)
    {
        SalesPerson salesPerson = new SalesPerson
                .Builder(lastName)
                .firstName(firstName)
                .hours(hours)
                .rate(rate)
                .customers(customers)
                .build();
        return salesPerson;
    }
}
