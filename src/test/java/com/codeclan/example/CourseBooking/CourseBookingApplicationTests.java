package com.codeclan.example.CourseBooking;

import com.codeclan.example.CourseBooking.models.Course;
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
		List<Course> foundCourse = courseRepository.getAllCoursesForStarRating(5);
		assertEquals(1, foundCourse.size());
		assertEquals("Intro to Python", foundCourse.get(0).getName());
	}

}
