package com.student.Student_APP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@GetMapping("/student")
	public String getDetails() {
		return "I am created student App and app is updated container new one  ";
	}

}
