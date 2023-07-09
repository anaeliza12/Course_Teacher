package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

	private Teacher teacher;
	private String name;
	private Set<Student> students;

	public Course(Teacher teacher,  String name) {

		students = new HashSet<>();
		this.teacher = teacher;
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Set<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Course [teacher=" + teacher + ", students=" + students + "]";
	}
	
	

}
