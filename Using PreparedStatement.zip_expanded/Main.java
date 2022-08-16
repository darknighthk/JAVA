import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 

public class Main {

 

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the user detail in CSV format");
        String userStr = sc.nextLine();
        
        String[] user = userStr.split(",");
        
        User u = new User(user[0], user[1], user[2], user[3]);
        
        UserDAO dao = new UserDAO();
        List<User> list = new ArrayList<User>();
        
        dao.insertDetails(u);
        
        list = dao.getAllUser();

 

        System.out.format("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
        for (int i = 0; i < list.size(); i++) {
            System.out.format("%-5s %-10s %-15s %-10s %s\n", list.get(i).getId(), list.get(i).getName(),
                    list.get(i).getContactDetail(), list.get(i).getUsername(), list.get(i).getPassword());
        }
    }

 

}