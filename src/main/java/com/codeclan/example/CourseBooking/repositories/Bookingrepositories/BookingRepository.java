package com.codeclan.example.CourseBooking.repositories.Bookingrepositories;

import com.codeclan.example.CourseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> getAllBookingsByDate(String date);
}
