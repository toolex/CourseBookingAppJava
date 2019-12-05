package com.codeclan.example.CourseBooking.repositories.Bookingrepositories;

import com.codeclan.example.CourseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
