package org.fundacionjala.movies;

/**
 * Calculates amount and frequent renter points.
 */
public class ChildrensRental extends Rental {

    /**
     * Builder to ChildrenRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public ChildrensRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        double thisAmount = 1.5;
        int days = 3;
        if (this.getDaysRented() > days)
            thisAmount += (this.getDaysRented() - days) * thisAmount;
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
