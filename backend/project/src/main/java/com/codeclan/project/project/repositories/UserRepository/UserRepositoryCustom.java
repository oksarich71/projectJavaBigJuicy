package com.codeclan.project.project.repositories.UserRepository;

import com.codeclan.project.project.models.Review;

import java.util.List;

public interface UserRepositoryCustom {
    List<Review> getAllReviewsForUser(Long userId);
}
