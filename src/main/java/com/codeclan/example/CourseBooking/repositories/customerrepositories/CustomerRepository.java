package com.codeclan.example.CourseBooking.repositories.customerrepositories;

import com.codeclan.example.CourseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getAllCustomersByBookingsCourseName(String name);
}
