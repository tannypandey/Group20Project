package com.db.grad.javaapi;//package com.db.grad.javaapi;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class JavaApiApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(JavaApiApplication.class, args);
//	}
//
//}

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.model.Trades;
import com.db.grad.javaapi.repository.TradesRepository;
import com.db.grad.javaapi.service.IBondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JavaApiApplication{


	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}


}