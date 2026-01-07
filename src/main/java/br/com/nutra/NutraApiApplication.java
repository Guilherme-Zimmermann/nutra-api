package br.com.nutra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class NutraApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutraApiApplication.class, args);
	}

}
