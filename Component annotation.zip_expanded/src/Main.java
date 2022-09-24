


import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.Owner;



public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Scanner sc=new Scanner(System.in);
		AnnotationConfigApplicationContext  context=new AnnotationConfigApplicationContext();
		context.scan("com.spring");
		context.refresh();
		Owner h= (Owner) context.getBean(Owner.class);
		System.out.println("Enter the name,password and mobile number of the user");
		h.setDetails(sc.nextLine(), sc.nextLine(), sc.nextLine());
		h.display();
		context.close();
	}

}
