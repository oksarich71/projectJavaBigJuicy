package com.codeclan.project.project.projections;

import com.codeclan.project.project.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedReviews", types = User.class)
public interface UserProjection {
    long getId();
    String getName();
    List<ReviewProjection> getReviews();
}
