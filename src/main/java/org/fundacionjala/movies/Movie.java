package org.fundacionjala.movies;

/**
 * Movie.
 */
public class Movie {
    private String title;

    /**
     * Builder to Movie object.
     *
     * @param title title to movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Obtain Title.
     *
     * @return Title to movie.
     */
    public String getTitle() {
        return title;
    }
}
