package com.aspirant.portal.aspirantapi;

import com.aspirant.portal.aspirantapi.models.Role;
import com.aspirant.portal.aspirantapi.models.User;
import com.aspirant.portal.aspirantapi.models.UserRole;
import com.aspirant.portal.aspirantapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AspirantapiApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(AspirantapiApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
