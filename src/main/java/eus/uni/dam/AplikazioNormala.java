package eus.uni.dam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eus.uni.dam.dao.EskatzaileaDAO;

@SpringBootApplication
public class AplikazioNormala {
	
	public static void main(String[] args) {
		SpringApplication.run(AplikazioNormala.class, args);
		
		
	}

}
