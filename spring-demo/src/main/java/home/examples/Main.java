package home.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-context.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		System.out.println("***********");
		vehicle.move();
		System.out.println("***********");
		System.out.println("***********");

	}
}
