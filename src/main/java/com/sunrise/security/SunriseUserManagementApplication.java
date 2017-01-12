package com.sunrise.security;

import com.sunrise.security.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SunriseUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunriseUserManagementApplication.class, args);
	}
}
