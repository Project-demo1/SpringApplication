package com.example.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CourseService;
import com.example.course.Course;
import com.example.exception.UserNotFoundException;

@RestController
public class CourseController 
{
	@Autowired
	private CourseService courseservice;
	@RequestMapping("/universities")
	public List<Course> getAllCourses()
	{
		List<Course> course = courseservice.getAllCourses();
		
		if(course.size() <= 0)
			throw new UserNotFoundException("university are not available, please update first.");
			
	  return course;
	}
	@GetMapping("/universities/{id}")
	public Course getCourse(@PathVariable Integer id)
	{
		Course course = courseservice.getCourse(id);
		
		if(course ==  null)
			throw new UserNotFoundException("university Id is not present");
			
	  return course;
	}
	@RequestMapping(method =RequestMethod.POST , value="/universities" )
	public void addcourse(@RequestBody Course course)
	{
		courseservice.addcourse(course);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/universities/{id}" )
	public void updatecourse(@PathVariable Integer id ,@RequestBody Course course)
	{
		courseservice.updatecourse(id,course);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/universities/{id}" )
	public void DeleteCourse(@PathVariable Integer id)
	{
		courseservice.deletecourse(id);
	}
}