package com.example.demospringboottomcat.web;

import com.example.demospringboottomcat.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
@EnableWebMvc
public class SampleController implements WebMvcConfigurer {

    @Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/")
	@ResponseBody
	public String helloWorld() {
    	return this.helloWorldService.getHelloMessage();
	}


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/*registry.addResourceHandler("/docs/index.html")
				.addResourceLocations("classpath:/META-INF/resources/webjars/swagger-ui/3.24.3");*/

		registry.addResourceHandler("/docs/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/swagger-ui/3.24.3/");
	}

}
