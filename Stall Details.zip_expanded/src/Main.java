
import com.spring.*;
import com.spring.dao.StallDAO;
import com.spring.entity.Stall;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StallDAO dao=(StallDAO) context.getBean("stallDAO");
		List<Stall> list=dao.getAllStalls();
		System.out.println("Stall Details :");
		System.out.printf("%-5s %-25s %-20s %-15s %s\n", "Id", "Stall Name", "Stall Detail", "Owner", "Items Available"); 
		for (Stall s : list) {
			System.out.printf("%-5s %-25s %-20s %-15s %s\n", 
					s.getId(),s.getStallName(),s.getDetail(),s.getStallOwner(),s.getItemsAvailable()); 
		}
	}

}