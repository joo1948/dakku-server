package com.mirim9.dakku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@EnableScheduling
public class DakkuServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DakkuServerApplication.class, args);
	}



}
