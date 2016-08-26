package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularRental}
 */
public class RegularRentalTest {
    private static final double DELTA = 0;
    private Rental regularRental;

    @Before
    public void setUp() {
        final String title = "The avenger";
        final Movie movie = new Movie(title);
        final int daysRented = 2;
        this.regularRental = new RegularRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expected = 2;
        assertEquals(expected, this.regularRental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expected = 1;
        assertEquals(expected, this.regularRental.calculateFrequentRenterPoints());
    }
}
