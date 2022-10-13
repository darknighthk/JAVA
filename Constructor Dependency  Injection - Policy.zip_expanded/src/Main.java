
import java.util.*;
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
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		List<Policy> list=new ArrayList<>();
		Policy po=new Policy();
		for (int j = 0; j < 7; j++) {
			po=(Policy) context.getBean("policy"+j);
			list.add(po);
		}
		
		System.out.println("Policy Details:");
		System.out.format("%-30s %-15s %-30s %-30s %-30s %-30s %s\n",
				"Policy ID","Value","Coverage Percentage","Customer ID","Customer","Email","Contact");
		
        for ( Policy p : list) {
        	System.out.format("%-30s %-15s %-30s %-30s %-30s %-30s %s\n",
        			p.getPolicyId(),p.policyValue,p.coveragePercentage,p.customer.customerId,p.customer.name,p.customer.email,p.customer.contactNumber);
		}
	}

}
