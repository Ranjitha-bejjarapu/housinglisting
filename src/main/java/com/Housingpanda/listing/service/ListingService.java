package com.Housingpanda.listing.service;

import com.Housingpanda.listing.repository.ListingRepository;
import com.Housingpanda.listing.model.Listing;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListingService {
    private ListingRepository listingRepository;

    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }
    public Listing saveListing(Listing listing)
    {
        return listingRepository.save(listing);
    }
    public List<Listing> getAllEntries()
    {
        return listingRepository.findAll();
    }


}
