
import com.spring.entity.*;
import com.spring.dao.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		OwnerDAO dao = (OwnerDAO) context.getBean("ownerDAO");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("... Owner List ...\n%-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Mobile");
		List<Owner> lo = dao.getAllOwners();
		for (Owner o : lo) {
			System.out.printf("%-15s %-15s %-15s %s\n", o.getId(), o.getName(), o.getEmailId(), o.getMobileNumber());
		}
		System.out.println("Enter the id you want to update");
		int id = Integer.parseInt(br.readLine());
		Owner o = dao.getOwnerById(id);
		if (o == null)
			System.out.println("No such owner");
		// if(s==null) System.out.println("No such owner!");
		else {
			System.out.println("Enter the mobile number and email id");
			dao.update(id, br.readLine(),  br.readLine());
			System.out.println("updated successfully");
			
			System.out.printf("... Owner List ...\n%-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Mobile");
			 lo = dao.getAllOwners();
			for (Owner o1 : lo) {
				System.out.printf("%-15s %-15s %-15s %s\n", o1.getId(), o1.getName(), o1.getEmailId(), o1.getMobileNumber());
			}
		}
	}

}
