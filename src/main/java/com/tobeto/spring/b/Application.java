package com.tobeto.spring.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// localhost:8080/api/persons

//annotation
// atandığı argümana özellikler kazandırır.
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// springi devreye alır
		SpringApplication.run(Application.class, args);
	}

}
