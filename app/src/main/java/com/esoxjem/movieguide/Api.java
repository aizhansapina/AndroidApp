package com.esoxjem.movieguide;

public class Api {
    private static final String BASE_POSTER_PATH = "https://image.tmdb.org/t/p/w342";
    private static final String BASR_BACKDROP_PATH = "https://image.tmdb.org/t/p/w780";

    private Api() {
        // hide implicit public constructor
    }

    public static String getPosterPath(String posterPath) {
        return BASE_POSTER_PATH + posterPath;
    }

    public static String getBackdropPath(String backdropPath) {
        return BASR_BACKDROP_PATH + backdropPath;
    }
}