package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class ControlRentalTest {

    @Test
    public void test_addRental() {
        Customer customer = new Customer("Aldo");
        ControlRental controlRental = new ControlRental(customer);
        controlRental.addRental(new NewReleaseRental(new Movie("Star Treck"), 2));
        controlRental.addRental(new RegularRental(new Movie("Mechanic"), 2));
        assertEquals(2, controlRental.countRentals());
    }

    @Test
    public void test_countRentals_whenNotAddRental() {
        Customer customer = new Customer("Aldo");
        ControlRental controlRental = new ControlRental(customer);
        assertEquals(0, controlRental.countRentals());
    }

    @Test
    public void test_calculateStatement() {
        Customer customer = new Customer("Aldo");
        ControlRental controlRental = new ControlRental(customer);
        controlRental.addRental(new NewReleaseRental(new Movie("Star Treck"), 2));
        controlRental.addRental(new RegularRental(new Movie("Mechanic"), 2));
        assertEquals(8.0, controlRental.calculateStatement(), 0);
    }

    @Test
    public void test_getCustomerName() {
        Customer customer = new Customer("Aldo");
        ControlRental controlRental = new ControlRental(customer);
        assertEquals("Aldo", controlRental.getCustomer().getName());
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        Customer customer = new Customer("Aldo");
        ControlRental controlRental = new ControlRental(customer);
        controlRental.addRental(new NewReleaseRental(new Movie("Star Treck"), 2));
        controlRental.addRental(new RegularRental(new Movie("Mechanic"), 2));
        assertEquals(3, controlRental.calculateFrequentRenterPoints());
    }
}