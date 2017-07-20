package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ClientApplication {

	@Value("${message}")
	String message;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
    @RequestMapping("/message")
	public String client() {
		return message;
	}
}
