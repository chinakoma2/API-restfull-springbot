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
		Tache t1 = new Tache("n1","prepa",new Date());
		Tache t2 = new Tache("n2","prepa",new Date());
		Tache t3 = new Tache("n3","prepa",new Date());
		Tache t4 = new Tache("n1","prepa",new Date());
		Tache t5 = new Tache("n2","prepa",new Date());
		Tache t6 = new Tache("n3","prepa",new Date());
		Tache t7 = new Tache("n1","prepa",new Date());
		Tache t8 = new Tache("n2","prepa",new Date());
		Tache t9 = new Tache("n3","prepa",new Date());
		Tache t10 = new Tache("n1","prepa",new Date());
		Tache t11 = new Tache("n2","prepa",new Date());
		Tache t12 = new Tache("n3","prepa",new Date());
		Tache t13 = new Tache("n1","prepa",new Date());
		Tache t14 = new Tache("n2","prepa",new Date());
		Tache t15 = new Tache("n3","prepa",new Date());
		Tache t16 = new Tache("n1","prepa",new Date());
		Tache t17 = new Tache("n2","prepa",new Date());
		Tache t18 = new Tache("n3","prepa",new Date());
		Tache t19 = new Tache("n1","prepa",new Date());
		Tache t20 = new Tache("n2","prepa",new Date());
		Tache t21 = new Tache("n3","prepa",new Date());
		tacheRepository.save(t1);
		tacheRepository.save(t2);
		tacheRepository.save(t3);
		tacheRepository.save(t4);
		tacheRepository.save(t5);
		tacheRepository.save(t6);
		tacheRepository.save(t7);
		tacheRepository.save(t8);
		tacheRepository.save(t9);
		tacheRepository.save(t10);
		tacheRepository.save(t11);
		tacheRepository.save(t12);
		tacheRepository.save(t13);
		tacheRepository.save(t14);
		tacheRepository.save(t15);
		tacheRepository.save(t16);
		tacheRepository.save(t17);
		tacheRepository.save(t18);
		tacheRepository.save(t19);
		tacheRepository.save(t20);
		tacheRepository.save(t21);
	}

}
