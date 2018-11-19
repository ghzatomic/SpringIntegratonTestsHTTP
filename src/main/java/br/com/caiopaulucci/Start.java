package br.com.caiopaulucci;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

@Configuration
@EnableAutoConfiguration
@IntegrationComponentScan(basePackages = "br.com.caiopaulucci")
@ImportResource(value={"classpath:context.xml"})
public class Start {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Start.class, args);

	}

}