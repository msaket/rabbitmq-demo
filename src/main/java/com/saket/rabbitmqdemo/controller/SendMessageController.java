package com.saket.rabbitmqdemo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit-queue")
public class SendMessageController {
	
	@Autowired
	RabbitTemplate rebbittemplate;
		
	@GetMapping("/send/{message}")
	public String sendMessage(@PathVariable String message) {
		System.out.println("Inside sendMessage with message: " + message);
		rebbittemplate.convertAndSend("demo.queue", message);
		return "Message Sent";
	}
}
