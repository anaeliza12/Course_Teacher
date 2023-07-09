package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Util {

	public Course checkCourses(List<Course> courses, String course) {
		Course aux = null;
		for (Course c : courses) {
			if (c.getName().equalsIgnoreCase(course)) {
				aux = c;
				break;

			}

		}
		return aux;
	}

	public void addStudentCourse(Student student, Course course) {
		course.getStudents().add(student);
	}

	public void addCourseStudent(Student student, Course course) {
		student.getCourses().add(course);
	}

	public String menu() {
		String aux = "1. Register" + "\n";
		aux += "2. Total Students" + "\n";
		aux += "3. Stop";

		return aux;
	}

	public String coursesAvailble(Teacher teacher) {
		String aux = "\n";

		int i = 0;
		for (Course c : teacher.getCourses()) {
			aux += teacher.getCourses().get(i) + "\n";
			i++;
		}
		return aux;

	}

	public int total(Teacher teacher) {
		Set<Student> students = new HashSet<>();
		for (Course t : teacher.getCourses()) {
			students.addAll(t.getStudents());
		}

		return students.size();
	}

}
