package com.davis.bamra.nykdavis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UserPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}

}
