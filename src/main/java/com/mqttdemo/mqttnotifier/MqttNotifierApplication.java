package com.mqttdemo.mqttnotifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
public class MqttNotifierApplication implements CommandLineRunner {

    @Qualifier("mqttOutboundChannel")
    @Autowired
	private MessageChannel mqttOutboundChannel;

	public static void main(String[] args) {
		SpringApplication.run(MqttNotifierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String message = "Hello from Spring Boot via MQTT!";
		mqttOutboundChannel.send(MessageBuilder.withPayload(message).build());
		System.out.println("✅ MQTT message sent: " + message);
	}
}
