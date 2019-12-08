package com.esoxjem.movieguide.details;

import com.esoxjem.movieguide.Movie;
import com.esoxjem.movieguide.Review;

import java.util.List;


interface MovieDetailsView {
    void showDetails(Movie movie);


    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
