package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class RentalTest {
    @Test
    public void test_getDaysRented() {
        Rental rental = new NewReleaseRental(new Movie("Terminator"), 2);
        assertEquals(2, rental.getDaysRented());
    }

    @Test
    public void test_getMovieToTitle() {
        Rental rental = new NewReleaseRental(new Movie("Terminator"), 2);
        assertEquals("Terminator", rental.getMovie().getTitle());
    }

    @Test
    public void test_getAmount() {
        Rental rental = new NewReleaseRental(new Movie("Terminator"), 2);
        assertEquals(6.0, rental.calculateAmount(), 0);
    }
}
