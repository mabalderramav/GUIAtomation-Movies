package org.fundacionjala.movies;


/**
 * Rental.
 */
public abstract class Rental {
    private Movie movie;
    private double increment;
    private double thisAmount;
    protected double daysLimit;
    protected int daysRented;
    protected static final int POINT = 1;

    /**
     * Builder to Rental object.
     *
     * @param movie      movie for rental.
     * @param daysRented days rented.
     */
    public Rental(Movie movie, int daysRented, double thisAmount, double increment, int daysLimit) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.thisAmount = thisAmount;
        this.increment = increment;
        this.daysLimit = daysLimit;
    }

    /**
     * Obtain movie of rental.
     *
     * @return movie of rental.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * determine amounts for movie.
     *
     * @return amount for movie.
     */
    public double calculateAmount(){
        if (this.daysRented > daysLimit) {
            this.thisAmount += (this.daysRented - daysLimit) * this.increment;
        }
        return this.thisAmount;
    }

    /**
     * Calculate frequent renter points.
     *
     * @return frequent renter points.
     */
    public int calculateFrequentRenterPoints(){
        return POINT;
    }
}
