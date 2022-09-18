package br.ufrpe.rubank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class RubankApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubankApplication.class, args);
	}

}
