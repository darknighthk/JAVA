import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
    public List<User> getAllUser() throws ClassNotFoundException, SQLException {
        List<User> userList = new ArrayList<User>();
        Connection con = null;
        con = DBConnection.getConnection();
        Statement statement= con.createStatement();
        ResultSet rs = statement.executeQuery("select * from \"user\" order by id");
        while (rs.next()) {
            User u = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            userList.add(u);
        }
        return userList;
    }
   
    public void insertDetails(User user) throws ClassNotFoundException, SQLException {
        //fill your code here
        Connection con = DBConnection.getConnection();
        PreparedStatement ps;
        ps = con.prepareStatement("insert into \"user\" values(\"user_seq\".nextval,?,?,?,?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getContactDetail());
        ps.setString(3, user.getUsername());
        ps.setString(4, user.getPassword());
       
         ps.executeUpdate();
       
       
    }
}