package com.SIS;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository{
    private Map<String, Student> students = new HashMap<>();

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
        students.put(student.getId(), student);

	}

	@Override
	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
        return students.get(id);
	}

}
