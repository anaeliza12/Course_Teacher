package program;

import javax.swing.JOptionPane;

import entities.Course;
import entities.Student;
import entities.Teacher;
import util.Util;

public class Program {
	public static Util u = new Util();

	public static void main(String[] args) {

		Teacher teacher = new Teacher("Alex");
		Course A = new Course(teacher, "A");
		Course B = new Course(teacher, "B");
		Course C = new Course(teacher, "C");


		teacher.addCourse(A);
		teacher.addCourse(B);
		teacher.addCourse(C);

		int choice = 0;
		do {

			try {
				
				choice = Integer.parseInt(JOptionPane.showInputDialog(null, u.menu(), JOptionPane.ERROR_MESSAGE));
				switch (choice) {
				
				case 1:
					registration(teacher);
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, u.total(teacher));
					break;
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas os números presentes");
			}

		} while (choice != 3);

	}

	public static void registration(Teacher teacher) {
		Student student = new Student(JOptionPane.showInputDialog(null, "Student name: "));
		String course = JOptionPane.showInputDialog(null, "Availble courses: " + u.coursesAvailble(teacher));
		Course aux = u.checkCourses(teacher.getCourses(), course);
		if (aux == null) {
			JOptionPane.showMessageDialog(null, "Inform an availble course");
		} else {
			u.addStudentCourse(student, u.checkCourses(teacher.getCourses(), course));
			u.addCourseStudent(student, aux);
			JOptionPane.showMessageDialog(null, "Registered");

		}
	}

}
