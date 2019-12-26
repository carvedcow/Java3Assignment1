package assignment1.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("teacherBean")
public class Teacher {

	// values
	private int teachId;
	private int teachName;
	private List<String> students;
	@Autowired // autowired annotation will wire Student1/Student2 to Teacher
	Student1 student1;
	Student2 student2;

	// constructor
	public Teacher() {
		super();
	}

	public Teacher(int teachId, int teachName) {
		super();
		this.teachId = teachId;
		this.teachName = teachName;
	}

	// methods
	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	public int getTeachName() {
		return teachName;
	}

	public void setTeachName(int teachName) {
		this.teachName = teachName;
	}
}
