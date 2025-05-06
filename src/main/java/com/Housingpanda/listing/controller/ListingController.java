package com.Housingpanda.listing.controller;

import com.Housingpanda.listing.service.ListingService;
import com.Housingpanda.listing.model.Listing;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listings")
public class ListingController {
    @Autowired
    private ListingService listingService;

    @PostMapping
    public ResponseEntity<Listing> createListing(@Valid @RequestBody Listing listing)
    {
        return new ResponseEntity<>(listingService.saveListing(listing), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Listing>> getAllEntries()
    {
        return ResponseEntity.ok(listingService.getAllEntries());
    }

}
