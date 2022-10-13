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

@Component("stallDAO")
public class StallDAO {

	private DataSource datasource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public List<Stall> getAllStalls() {
		String sql="Slect* from stall";
		
		return jdbcTemplate.query(sql, new StallMapper());
	}
	
	private static final class StallMapper implements RowMapper<Stall>{
		public Stall mapRow(ResultSet rs,int rowNum) throws SQLException {
			Stall s=new Stall();
			s.setId(rs.getInt(1));
			s.setStallName(rs.getString(2));
			s.setDetail(rs.getString(3));
			s.setStallOwner(rs.getString(4));
			s.setItemsAvailable(rs.getString(5));
			return s;
		}
	}

}