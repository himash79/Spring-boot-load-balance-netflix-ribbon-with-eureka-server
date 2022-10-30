package lk.himash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/api")
@Slf4j
public class ConsumerRestClient {
	
	@Autowired
	private RestTemplate template;

	@GetMapping("/getDetails/{id}")
	public String getDetails(@PathVariable String id) {
		log.info("Initialize getDetails() method | ConsumerRestController.class |");
		String url = "http://CONSUMER-ONE/v1/api/getDetails/" + id;
		return template.getForObject(url, String.class);
	}
	

}
