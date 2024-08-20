package com.SIS;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRepository studentRepository = new StudentRepositoryImpl();
        CourseRepository courseRepository = new CourseRepositoryImpl();
        EnrollmentService enrollmentService = new EnrollmentServiceImpl(studentRepository, courseRepository);

        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Smith");
        studentRepository.addStudent(student1);
        studentRepository.addStudent(student2);

        Course course1 = new Course("101", "Mathematics");
        Course course2 = new Course("102", "Physics");
        courseRepository.addCourse(course1);
        courseRepository.addCourse(course2);

        enrollmentService.enrollStudentInCourse("1", "101");
        enrollmentService.enrollStudentInCourse("2", "102");

        System.out.println("Student 1 enrolled courses: " + student1.getCourses().size());
        System.out.println("Student 2 enrolled courses: " + student2.getCourses().size());
	}

}
