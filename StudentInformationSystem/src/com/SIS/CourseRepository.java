package com.SIS;

public interface CourseRepository {
	void addCourse(Course course);
    Course getCourseById(String id);
}
