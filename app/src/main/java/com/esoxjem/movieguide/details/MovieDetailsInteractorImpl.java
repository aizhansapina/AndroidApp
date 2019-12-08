package com.esoxjem.movieguide.details;

import com.esoxjem.movieguide.Review;
import com.esoxjem.movieguide.ReviewsWrapper;
import com.esoxjem.movieguide.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }


    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
