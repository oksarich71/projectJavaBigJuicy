package com.codeclan.project.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

    @JsonIgnoreProperties("users")
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Review> reviews;


    public User(String name) {
            this.name = name;
            this.reviews = new ArrayList<Review>();
        }

        public User() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void add(Review review){
        reviews.add(review);
    }
    }
