package lk.himash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerOneApplication.class, args);
	}

}
