package com.codeclan.example.CourseBooking.repositories.Courserepositories;

import com.codeclan.example.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> getAllCoursesByStarRating(int starRating);
}
