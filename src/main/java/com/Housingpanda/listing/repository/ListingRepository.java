package com.Housingpanda.listing.repository;

import com.Housingpanda.listing.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
