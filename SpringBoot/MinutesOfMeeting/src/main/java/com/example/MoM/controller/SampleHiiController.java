package com.example.MoM.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.loginCredentials;

@RestController
public class SampleHiiController {
	
	@RequestMapping("/hii")
	public String showHi() {
		return "Hi!! welcome";
		
	}
    @PostMapping("/hello1")
	public  loginCredentials Hello(@RequestBody loginCredentials dto) {
    	System.out.println(dto);
		return dto;
	}
	
	

}
