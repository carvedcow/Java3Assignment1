package assignment1.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student2Bean")
public class Student2 {

	// values
	private int stdId;
	private String stdName;

	// constructor
	public Student2(int stdId, String stdName) {
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
