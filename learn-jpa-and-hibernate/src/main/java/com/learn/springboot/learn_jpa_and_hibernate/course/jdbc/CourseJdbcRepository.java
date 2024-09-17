package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTeplate;
	
	private static String INSERT_QUERY = 
			
			"""
			insert into course(id, name, author)
			values (?, ?, ?)
			
			""";
	
	private static String DELETE_QUERY =
			"""
			DELETE FROM course WHERE id=?;
			""";
	
	private static String SELECT_QUERY =
			"""
			SELECT * from Course
			where id = ?
			""";
	
	public void insert(Course course) {
//		.update() is use to INSERT, UPDATE,DELETE Query. 
		springJdbcTeplate.update(INSERT_QUERY, 
				course.getId(), course.getName(), course.getAuthor());
	}
	
	public void delete(long id) {
		springJdbcTeplate.update(DELETE_QUERY, id);
	}
	
	public Course findById (long id) {
		
//		ResultSet -> Bean => RowMapper =>							This is RowMapper
		return springJdbcTeplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		
//		ResultSet to a Bean.
//		Row Mapper help us to map ResultSet to Bean, t
//		they map each row in the ResultSet to a specific Bean
		
	}
	
}
