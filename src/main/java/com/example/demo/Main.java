package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.api.controller.UserApiController.UserController;
import com.example.demo.api.model.Users;

@SpringBootApplication
public class Main extends MainFrame {
	public static UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		System.out.println("TEST");

		Users users = userController.getAllUsers();
		System.out.println(users);

	}

}
