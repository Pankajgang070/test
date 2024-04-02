package com.nagarro.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {
	
	@GetMapping
	public ResponseEntity<String> testRoute(){
		return new ResponseEntity<>("Routes Working!!!!!!", HttpStatus.OK);
	}

	public static void main(String[] args) {
		Logger lg = LoggerFactory.getLogger(DevopsApplication.class);
		lg.info("Test Application Working!!!!!!!!!!!!");
		SpringApplication.run(DevopsApplication.class, args);
	}

}
