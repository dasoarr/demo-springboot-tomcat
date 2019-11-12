package com.example.demospringboottomcat.web;

import com.example.demospringboottomcat.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/")
	@ResponseBody
	public String helloWorld() {
    	return this.helloWorldService.getHelloMessage();
	}


}
