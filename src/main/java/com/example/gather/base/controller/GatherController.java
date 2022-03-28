package com.example.gather.base.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatherController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@GetMapping("/testapi")
	public String testee() throws InterruptedException {
		
		log.info("ÀÜ´Ù");
		Thread.sleep(15000);
		
		log.info("ÀÏ¾î³²");
		return "GATHER_RETURN STRING";
	}
}
