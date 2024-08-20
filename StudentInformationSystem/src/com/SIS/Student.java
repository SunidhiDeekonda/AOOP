package com.SIS;

import java.util.ArrayList;
import java.util.List;

public class Student {

	    private String id;
	    private String name;
	    private List<Course> courses;

	    public Student(String id, String name) {
	        this.id = id;
	        this.name = name;
	        this.courses = new ArrayList<>();
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Course> getCourses() {
	        return courses;
	    }

	    public void enrollInCourse(Course course) {
	        courses.add(course);
	    }
	}


