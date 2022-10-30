package lk.himash.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	@LoadBalanced
	public RestTemplate getTEmplate() {
		return new RestTemplate();
	}	
	
}
