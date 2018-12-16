package com.codeclan.project.project.repositories.UserRepository;

import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
    List<Review> getAllReviewsForUser(Long userId);
}

