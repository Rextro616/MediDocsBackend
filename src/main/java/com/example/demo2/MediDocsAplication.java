package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MediDocsAplication {
	//a
	public static void main(String[] args) {
		SpringApplication.run(MediDocsAplication.class, args);
	}

}

