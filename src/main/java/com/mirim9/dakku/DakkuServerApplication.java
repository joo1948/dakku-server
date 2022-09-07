package com.mirim9.dakku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DakkuServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DakkuServerApplication.class, args);
	}

}
