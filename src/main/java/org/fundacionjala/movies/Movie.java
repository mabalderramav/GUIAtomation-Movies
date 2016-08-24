package org.fundacionjala.movies;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class Movie {
    private String title;

    /**
     * Builder to Movie object.
     *
     * @param title     title to movie.
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