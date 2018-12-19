package com.codeclan.project.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
    @Table(name = "pubs")
    public class Pub {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="name")
        private String name;

        @Column(name="price")
        private double price;


        @Column(name = "latitude")
        private double latitude;

        @Column(name = "longitude")
        private double longitude;

    @JsonIgnoreProperties("pubs")
    @OneToMany(mappedBy = "pub", fetch = FetchType.LAZY)
    private List<Review> reviews;


    public Pub(String name, double price, double latitude, double longitude) {
            this.name = name;
            this.price = price;
            this.latitude = latitude;
            this.longitude = longitude;

            this.reviews = new ArrayList<Review>();
        }

        public Pub() {
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

    public double getPrice() {
        return price;
    }

       public void setPrice(double price) {
        this.price = price;
    }

       public double getLatitude() {
            return latitude;
        }

        public void setLatitude(int latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(int longitude) {
            this.longitude = longitude;
        }

        public void add(Review review){
        reviews.add(review);
    }

    }
