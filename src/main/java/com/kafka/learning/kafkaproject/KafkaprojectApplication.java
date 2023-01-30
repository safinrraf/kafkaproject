package com.kafka.learning.kafkaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaprojectApplication.class, args);
	}

	@KafkaListener(id = "myId", topics = "local_topic")
	public void listen(String in) throws Exception{
		System.out.println(in);
	}

}
