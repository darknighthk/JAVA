import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class HallDAO {
	public void saveHall(Hall hall) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
        PreparedStatement ps;
        ps = con.prepareStatement("INSERT INTO \"hall\" VALUES(\"hall_seq\".nextval,?,?,?,?)");
        //ps.setLong(1, hall.getId());
        ps.setString(1, hall.getName());
        ps.setString(2, hall.getContactNumber());
        ps.setDouble(3, hall.getCostPerDay());
        ps.setLong(4, hall.getOwner().getId());
        
       
        ps.executeUpdate();
	}
	
	public List<Hall> getAllHall() throws ClassNotFoundException, SQLException {
		List<Hall> hallList = new ArrayList<Hall>();
		User u=new User();
		UserDAO ud=new UserDAO();
		Connection con = null;
        con = DBConnection.getConnection();
        Statement statement= con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM \"hall\" ORDER BY id");
        
        while (rs.next()) {
        	ResultSet rs1 = statement.executeQuery("SELECT * FROM \"user\" WHERE id="+rs.getLong(5));
        	u=ud.getUser(rs1.getString(4));
            Hall h = new Hall(rs.getString(2), rs.getString(3), rs.getDouble(4),u);
            hallList.add(h);
        }
        return hallList;
	}
}
