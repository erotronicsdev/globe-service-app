package com.erotronics.gsa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan({"com.erotronics.gsa" })
public class GlobeServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GlobeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
