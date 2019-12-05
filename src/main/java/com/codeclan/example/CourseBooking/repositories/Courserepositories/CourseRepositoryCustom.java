package com.codeclan.example.CourseBooking.repositories.Courserepositories;

import com.codeclan.example.CourseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getAllCoursesForStarRating(int starRating);
    List<Course> getAllCourseForCustomerName(String customerName);
}
