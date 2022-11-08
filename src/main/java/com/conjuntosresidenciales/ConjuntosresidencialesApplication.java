package com.conjuntosresidenciales;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConjuntosresidencialesApplication{

	public static void main(String[] args) {
		System.out.println("El servicio si arranca");
		System.out.println("Contruccion de servicio en proceso");
		SpringApplication.run(ConjuntosresidencialesApplication.class, args);
	}


}
