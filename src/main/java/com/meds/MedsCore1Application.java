package com.meds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.meds"})
@EntityScan({"com.meds.model"})
@SpringBootApplication
public class MedsCore1Application {

	public static void main(String[] args) {
		SpringApplication.run(MedsCore1Application.class, args);
	}

}
