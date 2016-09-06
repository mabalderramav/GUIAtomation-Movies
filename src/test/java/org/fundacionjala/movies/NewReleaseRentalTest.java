package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link NewReleaseRental}
 */
public class NewReleaseRentalTest {
    private static final double DELTA = 0;
    private Rental newReleaseRental;

    @Before
    public void setUp() {
        final String title = "The avenger";
        final Movie movie = new Movie(title);
        final int daysRented = 2;
        this.newReleaseRental = new NewReleaseRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expected = 6;
        assertEquals(expected, this.newReleaseRental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expected = 2;
        assertEquals(expected, this.newReleaseRental.calculateFrequentRenterPoints());
    }
}
