package br.com.poc.topic.poctopicconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@ComponentScan({"br.com.poc.topic.poctopicconsumer"})
public class PocTopicConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocTopicConsumerApplication.class, args);
	}
}
