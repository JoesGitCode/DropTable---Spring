package com.codeclan.example.Restaurant.Booking.System.controllers;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings/{id}")
    public List<Booking> findBookingByCustomerId(@PathVariable Long id) {
        return bookingRepository.findBookingByCustomerId(id);
    }
}