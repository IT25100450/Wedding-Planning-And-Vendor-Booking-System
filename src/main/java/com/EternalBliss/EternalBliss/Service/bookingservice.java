package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.booking;
import com.EternalBliss.EternalBliss.repository.bookingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bookingservice {

    @Autowired
    private bookingrepo bookingRepository;

    // Get all bookings
    public List<booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get booking by ID
    public Optional<booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    // Save booking
    public booking saveBooking(booking booking) {
        return bookingRepository.save(booking);
    }

    // Delete booking
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}