package com.basics.springjdbc;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App {
	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate) context.getBean("jdbcTemplate");
		String sql="insert into employee values(?,?,?)";
		int update=jdbcTemplate.update(sql,1,"dao","hoang");
		System.out.println("UPDATED "+update);
	}
}
