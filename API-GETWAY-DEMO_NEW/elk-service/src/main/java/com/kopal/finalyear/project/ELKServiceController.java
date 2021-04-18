package com.kopal.finalyear.project;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kopal.finalyear.project.model.User;

@RestController
@RequestMapping(value = "/api/user")
public class ELKServiceController {
	Logger LOGGER = LoggerFactory.getLogger(ELKServiceController.class);

	@GetMapping(value = "/{userId}")
	public User finduser(@PathVariable Integer userId) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(new Integer(100), "Manish1", "Srivastava", 32));
		userList.add(new User(new Integer(200), "Manish2", "Srivastava", 32));
		userList.add(new User(new Integer(300), "Manish3", "Srivastava", 32));
		userList.add(new User(new Integer(400), "Manish4", "Srivastava", 32));
		userList.add(new User(new Integer(500), "Manish5", "Srivastava", 32));
		User userData = userList.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
		//User user = userList.stream().filter(u -> u.getUserId() == id).findAny().orElse(null);
		if (null != userData) {
			LOGGER.info("User Found : {}", userData);
			return userData;
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.info("User Not Found : {}", userId);
			}

		}
		return new User(new Integer(100), "000000", "000000", 00);

	}

	@GetMapping("/ping")
	public String ping() {
		return "Hello SpringBoot";
	}
}
