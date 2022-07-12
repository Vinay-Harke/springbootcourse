package com.springbootcourse.springbootcourse.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcourse.springbootcourse.models.Course;
import com.springbootcourse.springbootcourse.services.CourseService;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable("id") int id)
	{
		return this.courseService.getCourse(id);
	}
	
	
	@GetMapping("/courses")
	public List<Course> getAllCourse()
	{
		return this.courseService.getCourse();
	}
	
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course)
	{
		
		return this.courseService.addCourse(course);
	}
	
	@DeleteMapping("/deletecourse/{id}")
	public HttpStatus deleteCourse(@PathVariable("id") int id)
	{
		 this.courseService.deleteCourse(id);
		 return HttpStatus.OK; 
	}
	
	@PutMapping("/updatecourse")
	public void updateCourse(@RequestBody Course course)
	{
		 
		this.courseService.updateCourse(course);
	}
	
}
