package com.codeclan.project.project.controllers;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.repositories.PubRepository.PubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pubs")
public class PubController {

    @Autowired
    PubRepository pubRepository;

    @GetMapping(value = "/review/{id}")
    public List<Review> getAllReviewsForPub(@PathVariable Long id){
        return pubRepository.getAllReviewsForPub(id);
    }
}
