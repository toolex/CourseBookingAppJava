package com.codeclan.example.CourseBooking.repositories.customerrepositories;

import com.codeclan.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersFromCourseName(String courseName);
}
