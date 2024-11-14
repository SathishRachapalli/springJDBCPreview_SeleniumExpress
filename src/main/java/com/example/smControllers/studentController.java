package com.example.smControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sm.DAO.StudentDAO;
import com.example.sm.Service.studentService;
import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;

@Controller
public class studentController {
	
//	@Autowired
//	private StudentDAO studRepo;
	
	@Autowired
	studentService studService;
	
	@GetMapping("/showAll")
	public String showAllStudents(Model model)
	{
		
		List<Student> studentList = studService.loadStudents();
		
		model.addAttribute("students", studentList);
		
		return "student-list";
	}
	
	
	@GetMapping("/addStudent")
	public String addingStudent(Model model)
	{
		//captured the user submitted data from front-end.
		
		StudentDTO obj = new StudentDTO();
		model.addAttribute("student", obj);
		
		return "add-student";
	}
	
	
	@PostMapping("/save-student")
	//@ResponseBody   -- Be careful with this.
	// It was not redirecting to thankyou getmapping URL, instead its just printing "redirect:/thankyou"
	public String savingStudent(StudentDTO studentDTOObj)
	{
		// implementing logic to save the student record into the DB
		
		studService.saveStudentRecord(studentDTOObj);
		
		//return "redirect:/thankyou";  -- instead of this separate URL redirecting, we can 
		//just redirect to showAll url  -- that would be best.
		
		return "redirect:/showAll";
	}
	
//	@GetMapping("/thankyou")
//	@ResponseBody
//	public String thankingYou()
//	{
//		return "Student details has been successfully added!!!";
//	}
	
	
	

}
