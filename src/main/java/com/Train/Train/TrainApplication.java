package com.Train.Train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TrainApplication {
	@LoadBalanced
	@Bean
	public RestTemplate getNewRestTemplate(){return new RestTemplate();}
	public static void main(String[] args) {
		SpringApplication.run(TrainApplication.class, args);
	}

}
