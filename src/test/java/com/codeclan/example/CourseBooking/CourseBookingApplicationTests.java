package com.codeclan.example.CourseBooking;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.Bookingrepositories.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.Courserepositories.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.customerrepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetAllCoursesWithGivenRating(){
		List<Course> foundCourse = courseRepository.getAllCoursesByStarRating(5);
		assertEquals(1, foundCourse.size());
		assertEquals("Intro to Python", foundCourse.get(0).getName());
	}

	@Test
	public void canGetAllCustomersByCourseName(){
		List<Customer> foundCustomer = customerRepository.getAllCustomersByBookingsCourseNameIgnoreCase("Intro to Python");
		assertEquals(1, foundCustomer.size());
		assertEquals("Bob", foundCustomer.get(0).getName());
	}

	@Test
	public void canGetAllCoursesByBookingCustomerName(){
		List<Course> foundCourse = courseRepository.getAllCoursesByBookingsCustomerNameIgnoreCase("Jim");
		assertEquals(1, foundCourse.size());
		assertEquals("JS Basics", foundCourse.get(0).getName());
	}

	@Test
	public void canGetAllBookingsByDate(){
		List<Booking> foundBooking = bookingRepository.getAllBookingsByDate("20-01-2020");
		assertEquals(2, foundBooking.size());
	}

	@Test
	public void canGetAllCustomersByTownAndBookingsCourseIgnoreCase(){
		List<Customer> foundCustomer = customerRepository.getAllCustomersByTownAndBookingsCourseNameIgnoreCase("Edinburgh", "Intro to Python");
		assertEquals(1, foundCustomer.size());
		assertEquals(20, foundCustomer.get(0).getAge());
	}

	@Test
	public void canGetAllCustomersByAgeGreaterThanByTownAndBookingsCourseNameIgnoreCase(){
		List<Customer> foundCustomer = customerRepository.getAllCustomersByAgeGreaterThanAndTownAndBookingsCourseNameIgnoreCase(21,"Glasgow", "JS Basics");
		assertEquals(1, foundCustomer.size());
		assertEquals(30, foundCustomer.get(0).getAge());
	}




}
