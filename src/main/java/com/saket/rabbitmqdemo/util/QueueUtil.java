package com.saket.rabbitmqdemo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueUtil {
	
	@Value("${saket.broker.queue.prefix}")
	private static String queuePrefix;
	
	public static String getFinalQueueName(String queueName) {
		System.out.println("queuePrefix: " + queuePrefix);
		if(queueName == null || queueName.equals(""))
			return null;
		else 
			return String.format("%s.%s", queuePrefix, queueName);
	}

}
