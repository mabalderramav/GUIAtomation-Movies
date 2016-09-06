package org.fundacionjala.movies;

/**
 * Calculates amount and frequent renter points.
 */
public class RegularRental extends Rental {

    private static final double THIS_AMOUNT = 2;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 2;

    /**
     * Builder to RegularRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public RegularRental(Movie movie, int daysRented) {
        super(movie, daysRented, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
