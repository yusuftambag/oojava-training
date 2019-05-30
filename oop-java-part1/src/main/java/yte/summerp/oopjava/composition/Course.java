package yte.summerp.oopjava.composition;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> enrollmentList=new ArrayList<Student>();

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public List<Student> getEnrollmentList() {
		return enrollmentList;
	}

	public void enroll(Student student) {
		enrollmentList.add(student);
	}
}
