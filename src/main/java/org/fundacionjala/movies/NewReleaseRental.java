package org.fundacionjala.movies;

/**
 *
 */
public class NewReleaseRental extends Rental {

    private static final double THIS_AMOUNT = 3;
    private static final double INCREMENT = 0;
    private static final int DAYS_LIMIT = 1;
    /**
     * Builder to ChildrenRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public NewReleaseRental(Movie movie, int daysRented) {
        super(movie, daysRented, THIS_AMOUNT, INCREMENT, DAYS_LIMIT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        return this.daysRented * THIS_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints() {
        return this.daysRented > DAYS_LIMIT ? POINT + 1 : POINT;
    }
}
