package com.example.JdbcSpring;

import java.util.List;

public interface StudentDao {
	
	public int save(StudentEntity s);
	public List<StudentEntity> findAll();
	public StudentEntity findById(int id);
	public int updateById(StudentEntity s,int id);
	public int deleteById(int id);

}
