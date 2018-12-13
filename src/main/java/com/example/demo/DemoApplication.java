package com.example.demo;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean("customConnectionFactory")
	public ConnectionFactory connectionFactory(){
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory.setUsername("user");
		connectionFactory.setPassword("password");
		return connectionFactory;
	}


}

