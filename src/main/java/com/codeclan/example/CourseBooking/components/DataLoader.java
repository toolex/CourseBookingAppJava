package com.codeclan.example.CourseBooking.components;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.Bookingrepositories.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.Courserepositories.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.customerrepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }
    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Bob", "Edinburgh", 20);
        Customer customer2 = new Customer("Jim", "Glasgow", 30);
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        Course course1 = new Course("Intro to Python", "Edinburgh", 5);
        Course course2 = new Course("JS Basics", "Glasgow", 4);
        CourseRepository.save(course1);
        CourseRepository.save(course2);

        Booking booking1 = new Booking("05-02-2020", course1);
        Booking booking2 = new Booking("20-01-2020", course2);
        bookingRepository.save(course1);
        bookingRepository.save(course2);

    }
}
