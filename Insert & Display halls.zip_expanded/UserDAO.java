import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	public User getUser(String username) throws ClassNotFoundException, SQLException {
		User user = null;
		Connection con = null;
        con = DBConnection.getConnection();
        Statement statement= con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM user WHERE username ="+username);
        user = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        return user;
	}
}
