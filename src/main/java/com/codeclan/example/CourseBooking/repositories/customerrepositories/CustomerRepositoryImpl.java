package com.codeclan.example.CourseBooking.repositories.customerrepositories;

import com.codeclan.example.CourseBooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl  {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Customer> getAllCustomersByCourseName(String name) {
//        List<Customer> results = null;
//
//        Session session = entityManager.unwrap(Session.class);
//        Criteria criteria = session.createCriteria(Customer.class);
//        criteria.createAlias("bookings", "booking");
//        criteria.createAlias("booking.customer", "customer");
//
//        return null;
//    }
}
