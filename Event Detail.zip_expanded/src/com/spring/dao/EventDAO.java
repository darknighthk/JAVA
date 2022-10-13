package com.spring.dao;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.Types;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("eventDAO")
public class EventDAO {
	@Autowired
	private DataSource datasource;
	
	private JdbcTemplate jdbctemplate;	
	

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbctemplate = jdbcTemplate;
	}

	public List<Event> getAllEvents() {
		// fill your code
		String sql = "select * from event";
		return jdbctemplate.query(sql, new EventMapper());
	}

	public Event getEventById(int id) {
		// fill your code
		String sql = "select * from event where id=" + id;
		try {
			List<Event> o = jdbctemplate.query(sql, new EventMapper());
			if (o.isEmpty())

				return null;
			return o.get(0);
		} catch (Exception e) {
			return null;
		}

	}

	public void createEvent(int id, String eventName, String organiser, String organiserNumber, String hallName,
			String location) {
		// fill your code
		String sql = "INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (?,?,?,?,?,?)";
		jdbctemplate.update(sql, id, eventName, organiser, organiserNumber, hallName, location);
		System.out.println("Value inserted successfully");
	}

	private final class EventMapper implements RowMapper<Event> {
		public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
			Event emp = new Event();
			emp.setId(rs.getInt(1));
			emp.setEventName(rs.getString(2));
			emp.setOrganiser(rs.getString(3));
			emp.setOrganiserNumber(rs.getString(4));
			emp.setHallName(rs.getString(5));
			emp.setLocation(rs.getString(6));

			return emp;
		}
	}
}