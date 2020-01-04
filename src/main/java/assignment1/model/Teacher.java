package assignment1.model;


public class Teacher {
	
	//values
	int teacherId;
	String teacherName;
	Student student1;
	Student student2;
	
	//constructors
	public Teacher(int teacherId, String teacherName, Student student1, Student student2) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.student1 = student1;
		this.student2 = student2;
	}
	
	//methods
	public Student getStudent1() {
		return student1;
	}
	
	public Student getStudent2() {
		return student2;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
	
}
