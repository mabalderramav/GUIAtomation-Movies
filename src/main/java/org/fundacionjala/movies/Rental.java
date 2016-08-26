package org.fundacionjala.movies;


/**
 * Rental.
 */
public abstract class Rental {
    private Movie movie;
    private int daysRented;
    protected final int point;

    /**
     * Builder to Rental object.
     *
     * @param movie      movie for rental.
     * @param daysRented days rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.point = 1;
    }

    /**
     * Obtain days rented.
     *
     * @return days rented.
     */
    public int getDaysRented() {
        return daysRented;
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
    public abstract double calculateAmount();

    /**
     * Calculate frequent renter points.
     *
     * @return frequent renter points.
     */
    public abstract int calculateFrequentRenterPoints();
}
