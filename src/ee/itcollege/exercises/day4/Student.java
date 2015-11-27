package ee.itcollege.exercises.day4;

public class Student implements Comparable<Student> {
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
	

}
