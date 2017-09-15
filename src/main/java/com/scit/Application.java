package com.scit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.model.User;
import com.scit.service.UserService;

@Controller
@EnableAutoConfiguration
@ComponentScan
@EntityScan("com.scit.model")
@EnableJpaRepositories("com.scit.dao")
public class Application {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		User user = new User();
		user.setName("admin");
		user.setPassword("123456");
		userService.save(user);
		return "Hello World!";

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
