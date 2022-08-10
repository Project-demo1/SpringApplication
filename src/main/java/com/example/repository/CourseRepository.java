package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.course.Course;

public interface CourseRepository extends CrudRepository<Course,Integer>{
	

}
