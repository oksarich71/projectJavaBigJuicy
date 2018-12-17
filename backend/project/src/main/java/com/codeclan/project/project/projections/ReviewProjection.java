package com.codeclan.project.project.projections;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedPubUser", types = Review.class)
public interface ReviewProjection {
    long getId();
    int getRating();
    String getText();
    String getDate();
    String getImage();
    Pub getPub();
    User getUser();
}
