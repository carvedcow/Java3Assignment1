/* Assignment 1
 * 
 * Create a bean (Student1)
 * Create a bean (Student2)
 * Constructor (stdId, stdName)
 * Create a bean (Teacher)
 * Inject 2 Students into teacher
 * Show the teacher and her students information in the app.java class. 
 * 
 * 
 * CONFIGURATION CLASS USED
 */

package assignment1.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment1.config.AppConfig;
import assignment1.model.Teacher;

public class App {
	public static void main(String[] args) {

		//create context
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//call teacher bean
		Teacher teacherBean = context.getBean(Teacher.class);
		
		//print out teacher, student1 and student2 info
		System.out.println("Teacher Id: " + teacherBean.getTeacherId());
		System.out.println("Teacher name: " + teacherBean.getTeacherName());
		System.out.println("Student1 Id: " + teacherBean.getStudent1().getStdId());
		System.out.println("Student1 name: " + teacherBean.getStudent1().getStdName());
		System.out.println("Student2 Id: " + teacherBean.getStudent2().getStdId());
		System.out.println("Student2 name: " + teacherBean.getStudent2().getStdName());

		//close context
		context.close();
	}
}
