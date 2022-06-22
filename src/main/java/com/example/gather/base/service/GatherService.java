package com.example.gather.base.service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class GatherService {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Async
	public CompletableFuture<?> ser1() {
		log.info("ser 1 S  *********************");
		log.info(LocalDateTime.now().toString() + "ser 1");
		try {
			Thread.sleep(new SecureRandom().nextInt(93000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info(LocalDateTime.now().toString());
		log.info("ser 1 E  *********************");
		return null ;
	}
	
	@Async
	public CompletableFuture<?> ser2() {
		log.info("ser 2 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 2");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 2 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	@Async
	public CompletableFuture<?> ser3() {
		log.info("ser 3 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 3");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 3 E  *********************");
		return CompletableFuture.completedFuture("");
	}

	
	@Async
	public CompletableFuture<?> ser4() {
		log.info("ser 4 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 4");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 4 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	
	@Async
	public CompletableFuture<?> ser5() {
		log.info("ser 5 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 5");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 5 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	
	@Async
	public CompletableFuture<?> ser6() {
		log.info("ser 6 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 6");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 6 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	
	@Async
	public CompletableFuture<?> ser7() {
		log.info("ser 7 S  *********************");
		log.info(LocalDateTime.now().toString()  + "ser 7");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("ser 7 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	public CompletableFuture<?> noser1() {
		log.info("noser1 S  *********************");
		log.info(LocalDateTime.now().toString()  + "noser1");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("noser1 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
	public CompletableFuture<?> noser2() {
		log.info("noser2 S  *********************");
		log.info(LocalDateTime.now().toString()  + "noser2");
		try {
			Thread.sleep(new SecureRandom().nextInt(9000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(LocalDateTime.now().toString());
		log.info("noser2 E  *********************");
		return CompletableFuture.completedFuture("");
	}
	
}
