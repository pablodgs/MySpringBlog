package com.example.myspringblog.infra.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.myspringblog.core.entity.CommonUser;
import com.example.myspringblog.core.repository.CommonUserRepository;

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(CommonUserRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new CommonUser("Bilbo Baggins", "bilbo@baggins.com", "SecurePassword123")));
			log.info("Preloading " + repository.save(new CommonUser("Frodo Baggins", "frodo@baggins.com", "SecurePassword123")));
			log.info("Preloading " + repository.save(new CommonUser("Pablo Diamond", "pablo@diamond.com", "SecurePassword123")));
			log.info("Preloading " + repository.save(new CommonUser("Rick Sanchez", "rick@sanchez.com", "SecurePassword123")));
			log.info("Preloading " + repository.save(new CommonUser("Morty Smith", "morty@smith.com", "SecurePassword123")));

			// fetch all CommonUsers
			log.info("CommonUsers found with findAll():");
			log.info("-------------------------------");
			for (CommonUser commonUser : repository.findAll()) {
				log.info(commonUser.toString());
			}
			log.info("");
			
			// fetch an individual customer by ID
			CommonUser commonUser = repository.findById(1L);
			log.info("CommonUser found with findById(1L):");
			log.info("--------------------------------");
			log.info(commonUser.toString());
			log.info("");
		};
	}

}
