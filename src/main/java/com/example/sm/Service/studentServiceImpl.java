package com.example.sm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sm.DAO.StudentDAO;
import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;

@Service
public class studentServiceImpl implements studentService {
	
	@Autowired
	StudentDAO studentRepo;

	@Override
	public List<Student> loadStudents() {
		
		return studentRepo.loadStudents();
		
	}

	@Override
	public void saveStudentRecord(StudentDTO studentDTOObj) {
		
		studentRepo.saveStudentRecord(studentDTOObj);

	}

}
