package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

	private String user;
	private int Id;

	List<Course> courses = new ArrayList<>();

	public Student(String user) {

		this.user = user;
		Id = (int) (Math.random() * 101);
	}

	public String getUser() {
		return user;
	}

	public int getId() {
		return Id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [user=" + user + ", Id=" + Id + ", courses=" + courses + "]";
	}

	public void register(Course course) {
		courses.add(course);
		course.getStudents().add(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(user, other.user);
	}

}
