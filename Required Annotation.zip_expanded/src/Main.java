import com.spring.*;

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
		Hall e1= (Hall) context.getBean("hall");
		System.out.println("The hall of length "+e1.getLength()+" and width "+e1.getWidth()+" is owned by "+e1.getOwner().getName());
	}

}
