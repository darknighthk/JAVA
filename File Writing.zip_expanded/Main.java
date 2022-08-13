import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
ArrayList<User> userList = new ArrayList<>();
Scanner s = new Scanner(System.in);
System.out.println("Enter No of User");
int no = s.nextInt();
s.nextLine();
User user = null;
for (int i = 0; i < no; i++) {
System.out.println("Enter the details of user:" + (i + 1));
String input = s.nextLine();
String[] elements = input.split(",");
user = new User();
user.setName(elements[0]);
user.setMobileNumber(elements[1]);
user.setUsername(elements[2]);
user.setPassword(elements[3]);
userList.add(user);
user = null;
}
FileWriter fw = new FileWriter("output.csv");
BufferedWriter bw = new BufferedWriter(fw);
UserBO.writeFile(userList, bw);
}
}