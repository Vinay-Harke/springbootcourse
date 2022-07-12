package com.springbootcourse.springbootcourse.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcourse.springbootcourse.dao.CourseDao;
import com.springbootcourse.springbootcourse.models.Course;
import com.springbootcourse.springbootcourse.services.CourseService;


@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public Course getCourse(int id) {
		return this.courseDao.findById(id).get();
	}

	@Override
	public List<Course> getCourse() {
		
		List<Course> l1 = new ArrayList<Course>();
		this.courseDao.findAll().forEach(l1 :: add);
		return l1;
	}

	@Override
	public Course addCourse(Course course) {
		
		this.courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		this.courseDao.deleteById(id);
	}

	@Override
	public void updateCourse(Course course) {
		
		this.courseDao.deleteById(course.getId());
		this.courseDao.save(course);
	}

}
