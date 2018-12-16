package com.codeclan.project.project.controllers;

import com.codeclan.project.project.models.Review;
import com.codeclan.project.project.repositories.PubRepository.PubRepository;
import com.codeclan.project.project.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/review/{id}")
    public List<Review> getAllReviewsForUser(@PathVariable Long id){
        return userRepository.getAllReviewsForUser(id);
    }
}