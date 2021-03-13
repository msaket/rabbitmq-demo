package com.saket.rabbitmqdemo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {
	
	@RabbitListener(queues = "demo.queue")
	public void listner(String message) {
		System.out.println("Listner Received message is: " + message);
	}

}
