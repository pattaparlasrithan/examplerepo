package com.example.ticketmessage.jms;

import org.apache.activemq.ActiveMQConnection;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;

public class MessageSender {
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static String queueName = "MESSAGE_QUEUE";

}
