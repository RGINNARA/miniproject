package com.attendance.service;

import java.util.List;

import com.attendance.entity.Course;

public interface CourseService {

	Course addCourse(Course course);
    Course updateCourse(Course course, Long id);
    String deleteCourse(Long id);
    Course findByName(String name);
	Course findById(Long id);
	List<Course> findAll();
}
