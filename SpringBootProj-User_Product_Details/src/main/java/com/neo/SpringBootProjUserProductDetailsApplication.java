package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="<com.neo.repository>")
@SpringBootApplication
public class SpringBootProjUserProductDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjUserProductDetailsApplication.class, args);
	}

}
