
import com.spring.entity.*;
import com.spring.dao.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		OwnerDAO dao = new OwnerDAO();
		List<Owner> lo = dao.getAllOwners();
		for (Owner o : lo) {
			System.out.println(o.getName());
		}
		System.out.println("Enter the name of the person you want to search");
		System.out.println(dao.getOwnerNumberByName(br.readLine()));

	}

}
