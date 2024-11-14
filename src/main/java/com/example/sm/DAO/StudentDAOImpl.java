package com.example.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;
import com.example.sm.rowMapper.studentRowMapper;


@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	

	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		

		// we should have to talk to the DB using 'jdbcTemplate' and implement the logic
		//to collect the student list from DB.
		
		String sql="SELECT * FROM students";
		
		List<Student> studentData = jdbc.query(sql, new studentRowMapper());
		
		return studentData;
	}



	@Override
	public void saveStudentRecord(StudentDTO studentDTOObj) {
		// TODO Auto-generated method stub
		
		
	Object[] args={studentDTOObj.getName(),studentDTOObj.getMobile(),studentDTOObj.getCountry()};
	
	String sql="Insert into students(name,mobile,country) values (?,?,?)";
	
	 jdbc.update(sql, args);
	 
	 System.out.println("Student added successfully!!!");

	}

}
