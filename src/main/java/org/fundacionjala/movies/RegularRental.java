package org.fundacionjala.movies;

/**
 * Calculates amount and frequent renter points.
 */
public class RegularRental extends Rental {

    /**
     * Builder to RegularRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public RegularRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        final double days = 2;
        final double increment = 1.5;
        double thisAmount = 2;
        if (this.getDaysRented() > days)
            thisAmount += (this.getDaysRented() - days) * increment;
        return thisAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints() {
        return this.point;
    }
}
