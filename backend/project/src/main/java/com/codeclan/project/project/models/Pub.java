package com.codeclan.project.project.models;

import javax.persistence.*;


    @Entity
    @Table(name = "pubs")
    public class Pub {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="name")
        private String name;

        @Column(name = "latitude")
        private int latitude;

        @Column(name = "longitude")
        private int longitude;

        public Pub(String name, int latitude, int longitude) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
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

        public int getLatitude() {
            return latitude;
        }

        public void setLatitude(int latitude) {
            this.latitude = latitude;
        }

        public int getLongitude() {
            return longitude;
        }

        public void setLongitude(int longitude) {
            this.longitude = longitude;
        }
    }
