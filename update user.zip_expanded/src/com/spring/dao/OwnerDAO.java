package com.spring.dao;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class OwnerDAO {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Owner> getAllOwners() {

		String sql = "select * from owner";
		return getJdbcTemplate().query(sql, new OwnerMapper());

	}

	public Owner getOwnerById(int id) {

		String sql = "select * from owner where id=" + id;
		try {
			List<Owner> o = getJdbcTemplate().query(sql, new OwnerMapper());
			if (o.isEmpty())

				return null;
			return o.get(0);
		} catch (Exception e) {
			return null;
		}

	}

	public void update(int id, String mobile, String email) {
		String sql="update owner set mobile_number='"+mobile+"' email_id='"+email+"' where id="+id;
		getJdbcTemplate().update(sql);

	}

	private static final class OwnerMapper implements RowMapper<Owner> {
		public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
			Owner emp = new Owner();
			emp.setName(rs.getString("name"));
			emp.setPassword(rs.getString("password"));
			emp.setMobileNumber(rs.getString("mobile_number"));
			emp.setEmailId(rs.getString("mobile_number"));
			return emp;
		}
	}

}
