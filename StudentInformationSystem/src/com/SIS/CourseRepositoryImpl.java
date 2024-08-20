package com.SIS;
import java.util.HashMap;
import java.util.Map;

public class CourseRepositoryImpl implements CourseRepository {
    private Map<String, Course> courses = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public Course getCourseById(String id) {
        return courses.get(id);
    }
}
