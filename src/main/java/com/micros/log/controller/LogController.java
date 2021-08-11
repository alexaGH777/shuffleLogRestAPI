package com.micros.log.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	@PostMapping("/log")
	@Async
	public void logShuffledArray(@RequestBody String arrayStr) {
		
		System.out.println(arrayStr);
	}	
}
