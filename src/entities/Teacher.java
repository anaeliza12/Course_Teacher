package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private String name;
	private int Id;
	
	List<Course> courses;

	public Teacher(String name) {
		this.name = name;
		courses = new ArrayList<>();
		Id = (int) (Math.random() * 101);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

	
}
