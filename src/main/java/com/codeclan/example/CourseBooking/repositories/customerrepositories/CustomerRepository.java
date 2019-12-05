package com.codeclan.example.CourseBooking.repositories.customerrepositories;

import com.codeclan.example.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getAllCustomersByBookingsCourseNameIgnoreCase(String name);
    List<Customer> getAllCustomersByTownAndBookingsCourseNameIgnoreCase(String name, String courseName);
    List<Customer> getAllCustomersByAgeGreaterThanAndTownAndBookingsCourseNameIgnoreCase(int age, String name, String courseName);
}
