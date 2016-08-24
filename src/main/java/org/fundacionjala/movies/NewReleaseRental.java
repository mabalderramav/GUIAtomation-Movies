package org.fundacionjala.movies;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class NewReleaseRental extends Rental {
    public NewReleaseRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateAmount() {
        int mount = 3;
        return this.getDaysRented() * mount;
    }

    @Override
    public int calculateFrequentRenterPoints() {
        int days = 1;
        return (this.getDaysRented() > days) ? (this.point + 1) : this.point;
    }
}