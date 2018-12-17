package com.codeclan.project.project.projections;

import com.codeclan.project.project.models.Pub;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedReviews", types = Pub.class)
public interface PubProjection {
    long getId();
    String getName();
    List<ReviewProjection> getReviews();
}
