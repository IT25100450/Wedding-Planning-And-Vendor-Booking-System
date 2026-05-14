package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.model.booking;
import com.EternalBliss.EternalBliss.Service.bookingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private bookingservice bookingService;

    // GET all bookings
    @GetMapping
    public List<booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // GET booking by ID
    @GetMapping("/{id}")
    public Optional<booking> getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    // CREATE booking
    @PostMapping
    public booking createBooking(@RequestBody booking booking) {
        return bookingService.saveBooking(booking);
    }

    // UPDATE booking
    @PutMapping("/{id}")
    public booking updateBooking(@PathVariable Long id,
                                 @RequestBody booking updatedBooking) {

        updatedBooking.setId(id);

        return bookingService.saveBooking(updatedBooking);
    }

    // DELETE booking
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }
}