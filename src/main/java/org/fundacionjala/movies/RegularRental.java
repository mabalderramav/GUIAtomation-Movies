package org.fundacionjala.movies;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class RegularRental extends Rental {
    public RegularRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateAmount() {
        double thisAmount = 2;
        if (this.getDaysRented() > 2)
            thisAmount += (this.getDaysRented() - 2) * 1.5;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints() {
        return this.point;
    }
}