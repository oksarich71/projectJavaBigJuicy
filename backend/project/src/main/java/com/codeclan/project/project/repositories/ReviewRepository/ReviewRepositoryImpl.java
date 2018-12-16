package com.codeclan.project.project.repositories.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class ReviewRepositoryImpl {
    @Autowired
    EntityManager entityManager;
}
