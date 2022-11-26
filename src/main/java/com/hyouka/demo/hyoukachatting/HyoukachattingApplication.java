package com.hyouka.demo.hyoukachatting;

import com.hyouka.demo.hyoukachatting.repository.impl.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class HyoukachattingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyoukachattingApplication.class, args);
	}

}
