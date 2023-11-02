package com.okta.oauth2.spring.boot;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class OktaOauth2SpringBootApplication {
	
	@GetMapping("/")
	public String welcome2User(Principal principal) {
		return "Hi "+principal.getName()+" Welcome to app";
	}

	public static void main(String[] args) {
		SpringApplication.run(OktaOauth2SpringBootApplication.class, args);
	}

}
