package com.SIS;

public class EnrollmentServiceImpl implements EnrollmentService{
	private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public EnrollmentServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = studentRepository.getStudentById(studentId);
        Course course = courseRepository.getCourseById(courseId);
        if (student != null && course != null) {
            student.enrollInCourse(course);
            course.enrollStudent(student);
        }
    }

}
