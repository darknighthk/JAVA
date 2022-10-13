
import java.util.ArrayList;
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
        //Fill your code here
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		List<Book> lb=new ArrayList<>();
		for (int i = 1; i <=9; i++) {
			lb.add((Book) con.getBean("book"+i));
		}
        
		List<StandardPackage> ls=new ArrayList<>();
		for(int i = 1; i <=3; i++) {
			StandardPackage spa= (StandardPackage) con.getBean("package"+i);
			spa.calculateCost();
			ls.add(spa);
		
		}
		
		System.out.println("Package Details:");
		int i=1;
		
		for (StandardPackage sp : ls) {
			System.out.println("Package-"+(i++));
			
			sp.display();
			
		}
	}

}