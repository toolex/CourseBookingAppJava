package com.codeclan.example.CourseBooking.repositories.Bookingrepositories;

import com.codeclan.example.CourseBooking.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getAllBookingsForDate(String date);
}
