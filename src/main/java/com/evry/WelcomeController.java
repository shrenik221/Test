package com.evry;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evry.dao.DaoInterface;
import com.evry.entity.Student;

@Controller
public class WelcomeController {

	
	@Autowired 
	DaoInterface repository;
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "register";
	}
	
	
	@RequestMapping("/add")
	public String add(@ModelAttribute("Student")Student student) {
		repository.save(student);
		return "register";
	}

}