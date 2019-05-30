package yte.summerp.oopjava.composition;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private long studentId;
	private String studentName;
	private List<Course> studentCourseList=new ArrayList<Course>();

	public Student(long studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void addCourse(Course course) {
		studentCourseList.add(course);
	}

	public String getStudentName() {
		return  studentName;
	}

	public long getStudentId() {
		return studentId;
	}

	public List<Course> getStudentCourseList() {
		return studentCourseList;
	}
}
