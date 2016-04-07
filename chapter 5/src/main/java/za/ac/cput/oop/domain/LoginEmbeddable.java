package za.ac.cput.oop.domain;


import java.io.Serializable;

/**
 * Created by Ethon on 4/1/2016.
 */

public class LoginEmbeddable implements Serializable {


    private String username;
    private String password;

    //constructors
    private LoginEmbeddable()
    {

    }

    public LoginEmbeddable(Builder builder)
    {
        this.username = builder.username;
        this.password = builder.password;
    }

    //getters
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String username;
        private String password;

        public Builder(String username)
        {
            this.username = username;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder copy(LoginEmbeddable loginEmbedable)
        {
            this.username = loginEmbedable.username;
            this.password = loginEmbedable.password;
            return this;
        }

        public LoginEmbeddable build()
        {
            return new LoginEmbeddable(this);
        }
    }
}
