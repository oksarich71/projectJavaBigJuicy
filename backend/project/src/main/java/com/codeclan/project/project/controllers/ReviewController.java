package com.codeclan.project.project.controllers;

import com.codeclan.project.project.models.Pub;
import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.repositories.ReviewRepository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;



    @PostMapping(value = "/reviews")
    Review newReview(@RequestBody Review newReview){
        System.out.println(newReview);
        return reviewRepository.save(newReview);
    }






}
