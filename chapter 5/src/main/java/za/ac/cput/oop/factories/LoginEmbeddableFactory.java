package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.LoginEmbeddable;

/**
 * Created by Ethon on 4/1/2016.
 */
public interface LoginEmbeddableFactory {

    LoginEmbeddable createLogin(String username, String password);

}
