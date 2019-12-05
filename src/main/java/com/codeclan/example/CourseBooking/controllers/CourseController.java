package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Course;
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
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getAllCoursesByStarRating(@PathVariable int rating){
        return courseRepository.getAllCoursesByStarRating(rating);
    }

    @GetMapping(value = "/customer/{customer_name}")
    public List<Course> getAllCoursesByBookingsCustomerName(@PathVariable String name) {
        return courseRepository.getAllCoursesByBookingsCustomerName(name);
    }

}
