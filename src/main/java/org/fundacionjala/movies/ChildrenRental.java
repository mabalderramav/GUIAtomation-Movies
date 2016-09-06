package org.fundacionjala.movies;

/**
 * Calculates amount and frequent renter points.
 */
public class ChildrenRental extends Rental {

    private static final double AMOUNT = 1.5;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 3;

    /**
     * Builder to ChildrenRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public ChildrenRental(Movie movie, int daysRented) {
        super(movie, daysRented, AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
