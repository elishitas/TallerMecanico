package com.besysoft.TallerMecanico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerMecanicoApplication {

	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(TallerMecanicoApplication.class, args).getBeanDefinitionNames();
		//SpringApplication.run(TallerMecanicoApplication.class, args);
	}

}
