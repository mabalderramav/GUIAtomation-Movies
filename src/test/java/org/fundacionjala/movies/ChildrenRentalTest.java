package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenRentalTest}
 */
public class ChildrenRentalTest {

    private static final double DELTA = 0;
    private Rental childrenRental;

    @Before
    public void setUp() {
        final String title = "The avenger";
        final int daysRented = 2;
        final Movie movie = new Movie(title);
        this.childrenRental = new ChildrenRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expectedAmount = 1.5;
        assertEquals(expectedAmount, this.childrenRental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expectedRenterPoints = 1;
        assertEquals(expectedRenterPoints, this.childrenRental.calculateFrequentRenterPoints());
    }
}
