package com.example.SpringOTM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@EnableJpaAuditing
@SpringBootApplication
@RestController

public class SpringOtmApplication {

	 @RequestMapping("/")
	 @ResponseBody
	    String home() {
	      return "Hello World!";
	    }
	public static void main(String[] args) {
		SpringApplication.run(SpringOtmApplication.class, args);
		//System.out.println("hello Spring boot execution in heroku connected");
	}
}
