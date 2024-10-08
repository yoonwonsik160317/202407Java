package dp;

import java.util.Vector;

public class Student {
	private Professor advisor;
	private String name;
	private Vector<Course> courses;
	
	public Student() {
		
	}
	
	public Student(String name) {
	//	super();
		this.name = name;
		this.courses = new Vector<Course>();
	}
	
	

	@Override
	public String toString() {
		return "Student [advisor=" + advisor + ", name=" + name + ", courses=" + courses + "]";
	}

	public void advise(String msg) {
		System.out.println(msg);
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		if (courses.contains(course)) {
		courses.remove(course);
		}
	}
	
}
