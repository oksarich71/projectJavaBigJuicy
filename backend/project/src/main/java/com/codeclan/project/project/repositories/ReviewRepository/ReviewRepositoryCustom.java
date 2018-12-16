package com.codeclan.project.project.repositories.ReviewRepository;

import com.codeclan.project.project.models.Review;

import java.util.List;

public interface ReviewRepositoryCustom {
    List<Review> getAllReviewsForDate(String date);
}

