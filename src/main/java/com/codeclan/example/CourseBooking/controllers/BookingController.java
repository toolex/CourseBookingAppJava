package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.repositories.Bookingrepositories.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.Courserepositories.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.customerrepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getAllBookingsByDate(@PathVariable String date){
        return bookingRepository.getAllBookingsByDate(date);
    }
}
