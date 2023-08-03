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

import com.db.grad.javaapi.model.Trades;
import com.db.grad.javaapi.repository.TradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JavaApiApplication implements CommandLineRunner {

	@Autowired
	TradesRepository TradesRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Trades> trades = TradesRepository.findAll();
		for (Trades trade: trades) {
			System.out.println(trade);
		}
		}
}