package com.aws.codebuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiController {

	@GetMapping
	public String running() {
		return "Application started successfully";
	}

	@GetMapping("/hello")
	public String getMessage() {
		return "hello from aws";
		}
}
