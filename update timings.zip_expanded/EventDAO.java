
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

public class EventDAO {
    public Event getEventById(Long id)throws Exception{
        Event event = null;
        String sql = "select * from event where id = ?";
        try {
            PreparedStatement p = DBConnection.getConnection().prepareStatement(sql);
            p.setLong(1, id);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
            	event = new Event();
            	event.setId(rs.getLong(1));
            	event.setName(rs.getString(2));
            	event.setDetail(rs.getString(3));
            	event.setStartDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString(4)));
            	event.setEndDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString(5)));
            	event.setOrganizer(rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return event;   
	}
    public void updateEvent(Event e)throws Exception{
    	Connection con = DBConnection.getConnection();
        PreparedStatement ps;
        ps = con.prepareStatement("UPDATE event SET start_date=? , end_date=? WHERE id=?");
        
        ps.setTimestamp(1,new java.sql.Timestamp(e.getStartDate().getTime()));
        ps.setTimestamp(2,new java.sql.Timestamp(e.getEndDate().getTime()));
        ps.setLong(3,e.getId());
        
        ps.executeUpdate();
    }
    public List<Event> getAllEvents()throws Exception{
        List<Event> eventList = new ArrayList<>();
        String sql = "select * from event";
        try {
            PreparedStatement p = DBConnection.getConnection().prepareStatement(sql);
           
            Event event = null;
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
            	event = new Event();
            	event.setId(rs.getLong(1));
            	event.setName(rs.getString(2));
            	event.setDetail(rs.getString(3));
            	event.setStartDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString(4)));
            	event.setEndDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString(5)));
            	event.setOrganizer(rs.getString(6));
            	eventList.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eventList;
    }
}