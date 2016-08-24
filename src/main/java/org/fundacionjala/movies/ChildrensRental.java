package org.fundacionjala.movies;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class ChildrensRental extends Rental {
    public ChildrensRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double calculateAmount() {
        double thisAmount = 1.5;
        int days = 3;
        if (this.getDaysRented() > days)
            thisAmount += (this.getDaysRented() - days) * thisAmount;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints() {
        return this.point;
    }
}