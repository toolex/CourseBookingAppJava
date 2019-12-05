package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Customer;
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
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/course/{course_name}")
    public List<Customer> getAllCustomersByBookingsCourseName(@PathVariable String course_name){
        return customerRepository.getAllCustomersByBookingsCourseNameIgnoreCase(course_name);
    }

    @GetMapping(value = "/town/{town_name}/course/{course_name}")
    public List<Customer> getAllCustomersByTownAndBookingsCourseNameIgnoreCase(@PathVariable String town_name, @PathVariable String course_name){
        return customerRepository.getAllCustomersByTownAndBookingsCourseNameIgnoreCase(town_name, course_name);
    }

    @GetMapping(value = "/age/{age}/town/{town_name}/course/{course_name}")
    public List<Customer> getAllCustomersByAgeGreaterThanAndTownAndBookingsCourseNameIgnoreCase(@PathVariable int age, @PathVariable String town_name, @PathVariable String course_name){
        return customerRepository.getAllCustomersByAgeGreaterThanAndTownAndBookingsCourseNameIgnoreCase(age, town_name, course_name);
    }


}
