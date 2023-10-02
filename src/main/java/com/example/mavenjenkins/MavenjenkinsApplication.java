package com.example.mavenjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenjenkinsApplication {

	@GetMapping("/Hi")
	public String hello(){
		return "Hello Jenkins......";
	}
	public static void main(String[] args) {
		SpringApplication.run(MavenjenkinsApplication.class, args);
	}

}
