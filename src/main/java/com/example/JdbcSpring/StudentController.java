package com.example.JdbcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao sdao;
	
	@PostMapping("/save")
	public String savedata(@RequestBody StudentEntity s)
	{
		return sdao.save(s)+" record stored";
		
	}
	
	@GetMapping("/openall")
	public List<StudentEntity> openall()
	{
		return sdao.findAll();
		
	}
	
	@GetMapping("/open/{id}")
	public StudentEntity open(@PathVariable int id)
	{
		return sdao.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody StudentEntity s,@PathVariable int id)
	{
		return sdao.updateById(s, id);
		
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id)
	{
		return sdao.deleteById(id);
	}

}
