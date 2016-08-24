package org.fundacionjala.movies;


/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class Customer {
    private String name;

    /**
     * Builder to customer object.
     * @param name name to customer.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Obtain name the customer
     * @return name.
     */
    public String getName() {
        return name;
    }
}
