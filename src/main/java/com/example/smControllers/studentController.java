package com.example.smControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sm.DAO.StudentDAO;
import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;

@Controller
public class studentController {
	
	@Autowired
	private StudentDAO studRepo;
	
	@GetMapping("/showAll")
	public String showAllStudents(Model model)
	{
		
		List<Student> studentList = studRepo.loadStudents();
		
		model.addAttribute("students", studentList);
		
		return "student-list";
	}
	
	
	@GetMapping("/addStudent")
	public String addingStudent(Model model)
	{
		StudentDTO obj = new StudentDTO();
		model.addAttribute("student", obj);
		
		return "add-student";
	}
	
	
	
	
	@GetMapping("/save-student")
	@ResponseBody
	public String savingStudent(StudentDTO studentDTOObj)
	{
		// implementing logic to save the student record into the DB
		
		studRepo.saveStudentRecord(studentDTOObj);
		
		return "student saved!!!";
	}
	
	
	
	

}
