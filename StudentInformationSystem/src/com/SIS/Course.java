package com.SIS;

import java.util.ArrayList;
import java.util.List;

public class Course {
	    private String id;
	    private String name;
	    private List<Student> students;

	    public Course(String id, String name) {
	        this.id = id;
	        this.name = name;
	        this.students = new ArrayList<>();
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Student> getStudents() {
	        return students;
	    }

	    public void enrollStudent(Student student) {
	        students.add(student);
	    }
	}


