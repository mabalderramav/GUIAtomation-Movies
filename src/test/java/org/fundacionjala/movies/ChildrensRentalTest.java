package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrensRentalTest}
 */
public class ChildrensRentalTest {

    private static final double DELTA = 0;
    private Rental childrensRental;

    @Before
    public void setUp() {
        final String title = "The avenger";
        final int daysRented = 2;
        final Movie movie = new Movie(title);
        this.childrensRental = new ChildrensRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expected = 1.5;
        assertEquals(expected, this.childrensRental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expected = 1;
        assertEquals(expected, this.childrensRental.calculateFrequentRenterPoints());
    }
}
