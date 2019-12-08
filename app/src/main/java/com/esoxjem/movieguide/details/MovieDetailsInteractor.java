package com.esoxjem.movieguide.details;

import com.esoxjem.movieguide.Review;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
public interface MovieDetailsInteractor {

    Observable<List<Review>> getReviews(String id);
}
