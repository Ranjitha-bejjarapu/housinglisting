package com.Housingpanda.listing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;


@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
    public class Listing {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;
        private String description;
       @Min(value = 0, message = "Rent must be zero or positive")
        private double rent;
        private String address;
        private int numberOfRooms;
        private String contactInfo;
    }

