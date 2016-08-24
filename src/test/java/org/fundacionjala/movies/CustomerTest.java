package org.fundacionjala.movies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class CustomerTest {
    @Test
    public void test_getName() {
        Customer customer = new Customer("Aldo");
        assertEquals("Aldo", customer.getName());
    }
}
