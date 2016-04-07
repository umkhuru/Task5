package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.LoginEmbeddable;
import za.ac.cput.oop.factories.LoginEmbeddableFactory;

/**
 * Created by Ethon on 4/7/2016.
 */
public class LoginEmbeddableFactoryImpl implements LoginEmbeddableFactory {

    private static LoginEmbeddableFactoryImpl factory = null;

    private  LoginEmbeddableFactoryImpl() {
    }
    public static LoginEmbeddableFactoryImpl getInstance(){
        if(factory ==null)
            factory = new LoginEmbeddableFactoryImpl();
        return factory;
    }

    public LoginEmbeddable createLogin(String username, String password)
    {
        LoginEmbeddable loginEmbeddable = new LoginEmbeddable
                .Builder(username)
                .password(password)
                .build();
        return loginEmbeddable;
    }
}
