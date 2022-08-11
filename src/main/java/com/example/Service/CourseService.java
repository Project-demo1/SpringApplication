package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	public CourseRepository courseRepo;

public List<Course> getAllCourses() {
	// TODO Auto-generated method stub
	List<Course> courses =new ArrayList<>();
	courseRepo.findAll().forEach(courses::add);
	return courses;
}

public Course getCourse(Integer id) {
	// TODO Auto-generated method stub
   try
   {
	return courseRepo.findById(id).get();
   }
   catch(Exception e)
   {
  	 return null;
   }
}

public void addcourse(Course course) {
	courseRepo.save(course);
	// TODO Auto-generated method stub
	
}

public void updatecourse(Integer id, Course course) {
	// TODO Auto-generated method stub
	courseRepo.save(course);
	}

public void deletecourse(Integer id) {
	// TODO Auto-generated method stub
	courseRepo.deleteById(id);
	}
}



