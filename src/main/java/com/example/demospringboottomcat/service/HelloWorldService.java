package com.example.demospringboottomcat.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    private static Log logger = LogFactory.getLog(HelloWorldService.class);


    @Value("${name:World}")
	private String name;

	public String getHelloMessage() {
        logger.info("Hello " + this.name);
		return "Hello " + this.name;
	}

}
