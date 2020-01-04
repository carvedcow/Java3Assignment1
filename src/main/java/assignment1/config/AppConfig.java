package assignment1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import assignment1.model.Student;
import assignment1.model.Teacher;

@Configuration
public class AppConfig {
	
	@Bean("student1")
	public Student student1() {
		return new Student(1, "John");
	}
	
	@Bean("student2")
	public Student student2() {
		return new Student(2, "David");
	}
	
	@Bean("teacher")
	public Teacher teacher() {
		return new Teacher(111, "Mary", student1(), student2());
	}
	
}
