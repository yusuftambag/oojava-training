package yte.summerp.oopjava.composition;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseRunner {
	public static void main(String argv[]) {
		List<Student> studentList=new ArrayList<Student>();
		Student student=new Student(1028307,"Yusuf TAMBAĞ");
		studentList.add(student);
		studentList.add(new Student(777356,"Ahmet BİLGE"));
		studentList.add(new Student(777356,"Hakan KÖK"));
		studentList.add(new Student(16728394,"Ahmet TANDEM"));

		List<Course> courseList=new ArrayList<Course>();
		courseList.add(new Course("Design and Analysis of Algorithms"));
		courseList.add(new Course("Programming with Java"));
		courseList.add(new Course("Design Patters"));
		courseList.add(new Course("Digital Design"));
		courseList.add(new Course("Turing Machines"));
		courseList.add(new Course("Digital Design"));

		student.addCourse(courseList.get(5));
		student.addCourse(courseList.get(2));
		student.addCourse(courseList.get(3));
		for(int i=1;i<studentList.size();i++) {
			student = studentList.get(i);
			student.addCourse(courseList.get(i));
			student.addCourse(courseList.get(i+1));
			student.addCourse(courseList.get(i-1));
		}
		System.out.println("Last registered student: "+student.getStudentName());
		for(Student student1:studentList) {
			System.out.println("Student Id: "+student1.getStudentId());
			System.out.println("Student Name: "+student1.getStudentName());
			System.out.println("\nCourse List:\n");
			List<Course> courseList1=student1.getStudentCourseList();
			for(Course course:courseList1) {
				System.out.println("Course Name: "+course.getCourseName());
			}
			System.out.println();
		}
	}
}
