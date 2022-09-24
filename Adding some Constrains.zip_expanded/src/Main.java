
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Event;
import com.spring.Hall;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hall h= (Hall) context.getBean("hall");
		
		List<Event> el=h.getEventList();
		for (Event e : el) {
			e.display();
		}
	

	}

}
