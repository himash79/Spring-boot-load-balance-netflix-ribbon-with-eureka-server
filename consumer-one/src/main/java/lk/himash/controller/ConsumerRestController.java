package lk.himash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.entity.User;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/api")
@Slf4j
public class ConsumerRestController {

	@GetMapping("/getDetails/{id}")
	public User getDetails(@PathVariable String id) {
		log.info("Initialize getDetails() method | ConsumerRestController.class |");
		User user = new User("0001", "FNAME", "LNAME", "25");
		return user;
	}

}
