package com.spring.dao;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class OwnerDAO {

	public List<Owner> getAllOwners() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "select name from owner";
		return jdbcTemplate.query(sql, new OwnerMapper());

	}

	public String getOwnerNumberByName(String Name) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "select * from owner where name='"+Name+"'";
		Owner o= jdbcTemplate.queryForObject(sql, new OwnerMapper());
		if(o==null) return "No such owner!";
		return "You can contact "+Name+" by "+o.getMobileNumber();

	}

	private static final class OwnerMapper implements RowMapper<Owner> {
		public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
			Owner emp = new Owner();
			emp.setName(rs.getString("name"));
			emp.setPassword(rs.getString("password"));
			emp.setMobileNumber(rs.getString("mobileNumber"));
			emp.setEmailId(rs.getString("emailid"));
			return emp;
		}
	}

}
