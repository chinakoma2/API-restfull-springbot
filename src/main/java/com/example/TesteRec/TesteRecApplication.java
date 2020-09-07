package com.example.TesteRec;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.TesteRec.dao.TacheRepository;
import com.example.TesteRec.entities.Tache;

@SpringBootApplication
public class TesteRecApplication implements CommandLineRunner{
	
	@Autowired
	private TacheRepository tacheRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteRecApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
