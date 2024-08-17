package com.example.JdbcSpring;

public class StudentEntity {
	
	private int id;
	private String stu_name;
	private int stu_reg;
	private String stu_dept;
	public StudentEntity() {
	
	}
	public StudentEntity(int id, String stu_name, int stu_reg, String stu_dept) {
		
		this.id = id;
		this.stu_name = stu_name;
		this.stu_reg = stu_reg;
		this.stu_dept = stu_dept;
	}
	public StudentEntity(String stu_name, int stu_reg, String stu_dept) {
		
		this.stu_name = stu_name;
		this.stu_reg = stu_reg;
		this.stu_dept = stu_dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_reg() {
		return stu_reg;
	}
	public void setStu_reg(int stu_reg) {
		this.stu_reg = stu_reg;
	}
	public String getStu_dept() {
		return stu_dept;
	}
	public void setStu_dept(String stu_dept) {
		this.stu_dept = stu_dept;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", stu_name=" + stu_name + ", stu_reg=" + stu_reg + ", stu_dept=" + stu_dept
				+ "]";
	}
	

}
