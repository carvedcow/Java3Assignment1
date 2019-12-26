/* Assignment 1
 * 
 * Create a bean => Student1
 * Create a bean => Student2
 * Constructor (stdid, stdName)
 * Create a bean => Teacher
 * Inject 2 Students into teacher
 * Show the teacher and her students information in the app.java class. 
 * 
 */


package assignment1.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// Create configuration from annotations
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Scan for beans annotations
		context.scan("assignment1.model");
		context.refresh();
		
//		Person p = context.getBean(Person.class);
//		p.showMyFriends();
		
		context.close();
	}
}
