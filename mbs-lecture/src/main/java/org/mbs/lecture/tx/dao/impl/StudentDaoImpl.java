package org.mbs.lecture.tx.dao.impl;

import org.mbs.lecture.ioc.Student;
import org.mbs.lecture.tx.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by mbs on 2020/6/18 9:56
 */
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Student student) {
		String sql = "insert into student(name, age) values(?, ?)";
		this.jdbcTemplate.update(sql, student.getName(), student.getAge());
	}
}
