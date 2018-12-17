package com.codeclan.project.project.repositories.ReviewRepository;

import com.codeclan.project.project.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    List<Review> getAllReviewsForDate(String date);
}
