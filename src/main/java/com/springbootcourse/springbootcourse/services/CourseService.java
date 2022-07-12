package com.springbootcourse.springbootcourse.services;

import java.util.List;

import com.springbootcourse.springbootcourse.models.Course;

public interface CourseService {
	
	public Course getCourse(int id);
	public List<Course> getCourse();
	
	public Course addCourse(Course course);
	public void deleteCourse(int id);
	public void updateCourse(Course course);
	
}
