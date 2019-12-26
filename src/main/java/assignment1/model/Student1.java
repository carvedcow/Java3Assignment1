package assignment1.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student1Bean")
public class Student1 {

	// values
	private int stdId;
	private String stdName;

	// constructor
	public Student1(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}

	// methods
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
}
