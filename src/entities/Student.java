package entities;

import java.util.ArrayList;
import java.util.List;

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
	
	
	
}

