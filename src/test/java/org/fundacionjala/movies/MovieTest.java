package org.fundacionjala.movies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class MovieTest {

    @Test
    public void test_getTitle() {
        Movie movie = new Movie("Terminator");
        assertEquals("Terminator", movie.getTitle());
    }
}
