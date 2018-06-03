package com.chatapp.chatapplication.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ChatapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatapplicationApplication.class, args);
	}
}
