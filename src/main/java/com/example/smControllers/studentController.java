package com.example.smControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sm.DAO.StudentDAO;
import com.example.sm.api.Student;

@Controller
public class studentController {
	
	@Autowired
	private StudentDAO studRepo;
	
	@GetMapping("/showAll")
	public String showAllStudents(Model model)
	{
		
		List<Student> studentList = studRepo.loadStudents();
		
//		for(Student tempStudent:studentList)
//		{
//			System.out.println(tempStudent);
//		}
		
		
		model.addAttribute("students", studentList);
		
		return "student-list";
	}

}
