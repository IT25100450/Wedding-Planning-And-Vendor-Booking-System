	package com.EternalBliss.EternalBliss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EternalBlissApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EternalBlissApplication.class);
		// If no profile has been activated via env/VM args, default to 'dev' so local runs use H2
		if (System.getenv("SPRING_PROFILES_ACTIVE") == null && System.getProperty("spring.profiles.active") == null) {
			app.setAdditionalProfiles("dev");
		}
		app.run(args);
	}

}
