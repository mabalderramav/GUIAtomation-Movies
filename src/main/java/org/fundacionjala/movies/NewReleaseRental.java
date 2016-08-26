package org.fundacionjala.movies;

/**
 *
 */
public class NewReleaseRental extends Rental {

    /**
     * Builder to ChildrenRental object.
     *
     * @param movie      movie Object.
     * @param daysRented days rented.
     */
    public NewReleaseRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        int mount = 3;
        return this.getDaysRented() * mount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints() {
        int days = 1;
        return (this.getDaysRented() > days) ? (this.point + 1) : this.point;
    }
}
