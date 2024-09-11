package com.magicpost.magicPost;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MagicPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicPostApplication.class, args);
		log.info("Application started");
	}

}
