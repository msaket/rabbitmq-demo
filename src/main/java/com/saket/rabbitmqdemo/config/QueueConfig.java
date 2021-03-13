package com.saket.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
	
	@Bean
	public Queue demoQueue() {
		return new Queue("demo.queue", Boolean.FALSE);
	}

}
