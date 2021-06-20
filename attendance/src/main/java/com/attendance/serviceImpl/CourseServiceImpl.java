package com.attendance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entity.Course;
import com.attendance.repository.CourseRepository;
import com.attendance.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public Course updateCourse(Course course, Long id) {
		Course newCourse = courseRepo.getById(id);
		newCourse.setName(course.getName());
		newCourse.setDescription(course.getDescription());
		return courseRepo.save(newCourse);
	}

	@Override
	public String deleteCourse(Long id) {
		courseRepo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Course findByName(String name) {
		return courseRepo.findByName(name);
	}

	@Override
	public Course findById(Long id) {
		return courseRepo.findById(id).get();
	}

	@Override
	public List<Course> findAll() {
		return courseRepo.findAll();
	}

	

	

}
