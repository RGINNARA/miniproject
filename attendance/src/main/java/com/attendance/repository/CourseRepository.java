package com.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attendance.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

	Course findByName(String name);

}
