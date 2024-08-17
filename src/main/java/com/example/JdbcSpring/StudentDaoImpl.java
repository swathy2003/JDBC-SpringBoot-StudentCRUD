package com.example.JdbcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(StudentEntity s) {
		
		return jdbcTemplate.update("insert into stu_details(stu_name,stu_reg,stu_dept) values(?,?,?)"
				,new Object[] {s.getStu_name(),s.getStu_reg(),s.getStu_dept()});
	}

	@Override
	public List<StudentEntity> findAll() {
	
		return jdbcTemplate.query("select *from stu_details", 
				new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class));
	}

	@Override
	public StudentEntity findById(int id) {
		
		return jdbcTemplate.queryForObject("select *from stu_details where id=?", 
				new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class),id);
	}

	@Override
	public int updateById(StudentEntity s, int id) {
		 
		return jdbcTemplate.update("update stu_details set stu_dept=? where id=?",
				new Object[] {s.getStu_dept(),id});
	}

	@Override
	public int deleteById(int id) {
		
		return jdbcTemplate.update("delete from stu_details where id=?",id);
	}

}
