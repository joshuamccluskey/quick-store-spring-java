package com.joshuamccluskey.quickstorespringjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class QuickStoreSpringJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickStoreSpringJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository repository){
		return args -> {
			Product product = new Product(
					"Burton 2020",
					"Burton",
					550,
					"USA",
					30,"https://www.rei.com/media/37a60ae6-bc48-4e00-b5d2-01e49bb02fe1?size=784x588"

			);
			repository.insert(product);
		};
	}


}
