package com.codeclan.project.project.repositories.ReviewRepository;

import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.projections.ReviewProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = ReviewProjection.class)
public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    List<Review> getAllReviewsForDate(String date);
}
