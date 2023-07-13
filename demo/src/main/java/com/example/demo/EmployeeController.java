package com.example.demo;
/* 
 * @Author 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/hello")
	public String SayHello(){
		
		return "Springboot Docker Demo ";
	}

}
