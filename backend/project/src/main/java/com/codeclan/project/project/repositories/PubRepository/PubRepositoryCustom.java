package com.codeclan.project.project.repositories.PubRepository;

import com.codeclan.project.project.models.Review;

import java.util.List;

public interface PubRepositoryCustom {
    List<Review> getAllReviewsForPub(Long pubId);
}
