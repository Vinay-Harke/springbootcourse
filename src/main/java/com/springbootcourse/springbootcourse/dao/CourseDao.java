package com.springbootcourse.springbootcourse.dao;
import org.springframework.data.repository.CrudRepository;
import com.springbootcourse.springbootcourse.models.Course;


public interface CourseDao extends CrudRepository<Course,Integer>{
	
}
