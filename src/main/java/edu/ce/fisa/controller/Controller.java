package edu.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public String getHello() {
		return "Get Method!!!!!!!!!!!!!!!!!!!! wow";
	}
	
	@PostMapping("/post")
	public String postHello() {
		return "Post Method";
	}


}
