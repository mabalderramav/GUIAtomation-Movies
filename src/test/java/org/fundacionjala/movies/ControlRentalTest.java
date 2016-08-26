package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ControlRentalTest}
 */
public class ControlRentalTest {

    private static final double DELTA = 0;
    private ControlRental controlRental;

    @Before
    public void setUp() {
        final int daysRented = 2;
        final String name = "Aldo";
        final String titleA = "Star Treck";
        final String titleB = "Mechanic";
        final Customer customer = new Customer(name);
        this.controlRental = new ControlRental(customer);
        final Movie starTreck = new Movie(titleA);
        final Movie mechanic = new Movie(titleB);
        this.controlRental.addRental(new NewReleaseRental(starTreck, daysRented));
        this.controlRental.addRental(new RegularRental(mechanic, daysRented));
    }

    @Test
    public void test_addRental() {
        final int expected = 2;
        assertEquals(expected, this.controlRental.countRentals());
    }

    @Test
    public void test_countRentals_whenNotAddRental() {
        final int expected = 2;
        assertEquals(expected, this.controlRental.countRentals());
    }

    @Test
    public void test_calculateStatement() {
        final double expected = 8.0;
        assertEquals(expected, this.controlRental.calculateStatement(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expected = 3;
        assertEquals(expected, this.controlRental.calculateFrequentRenterPoints());
    }
}