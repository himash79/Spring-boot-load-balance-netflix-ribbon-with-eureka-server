package lk.himash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerTwoApplication.class, args);
	}

}
