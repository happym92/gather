package com.example.gather.base.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import com.example.gather.base.service.GatherService;


@RestController
public class GatherController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private GatherService gs;
	
	@GetMapping("/oauth/2.0/authorize")
	public ResponseEntity<?> testee(@RequestHeader HttpHeaders header) throws InterruptedException, JSONException {
		
		log.info(header.toString());
		
		
		Map<String, String> rtnMap = new HashMap<String, String>();
		rtnMap.put("org_code", "A1AAER0000");            
		rtnMap.put("install_url_android", "HTTP");       
		rtnMap.put("app_scheme_android", "ERKSE");       
		rtnMap.put("app_scheme_iOS", "IOS APPSCHEM");    
		rtnMap.put("install_url_iOS", "IOS URL");     
		
		HttpHeaders reqHeader = new HttpHeaders();
		MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<String, String>();
		headerMap.add("Location", "offerureeeel");
		headerMap.add("Content-Type", "application/json");
		
		log.info(rtnMap.toString());
		rtnMap.put("error", "400");
		rtnMap.put("error_description", "invalid request");
		
		JSONObject jo = new JSONObject();
		jo.put("org_code", "a1111");
		return new ResponseEntity<>(rtnMap, headerMap, HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/gathering")
	public ResponseEntity<?> gathering(@RequestHeader HttpHeaders header) throws InterruptedException, JSONException {
		log.info("gathering S  *********************");
		log.info(LocalDateTime.now().toString() + " : Start time");
		CompletableFuture<?> totalRes = new CompletableFuture<>();
		CompletableFuture<?> ser1 = new CompletableFuture<>();
		CompletableFuture<?> ser2 = new CompletableFuture<>();
		CompletableFuture<?> ser3 = new CompletableFuture<>();
		CompletableFuture<?> ser4 = new CompletableFuture<>();
		CompletableFuture<?> ser5 = new CompletableFuture<>();
		CompletableFuture<?> ser6 = new CompletableFuture<>();
		CompletableFuture<?> ser7 = new CompletableFuture<>();
		
//		log.info("control-1   *********************");
//		ser1 = gs.ser1();
//		log.info("control-2   *********************");
//		ser2 = gs.ser2();
//		log.info("control-3   *********************");
//		ser3 = gs.ser3();
//		log.info("control-4   *********************");
//		ser4 = gs.ser4();
//		log.info("control-5   *********************");
//		ser5 = gs.ser5();
//		log.info("control-6   *********************");
//		ser6 = gs.ser6();
//		log.info("control-7   *********************");
//		ser7 = gs.ser7();
//		log.info("control-8   *********************");
		
		CompletableFuture<?> future = CompletableFuture.supplyAsync(() -> {
			CompletableFuture<?> a = gs.ser1();
			CompletableFuture<?> b = gs.ser2();
			log.info("!!!!!!!!!!!!!!!!!!!!!!!!!future   *********************");
			
			try {
				return CompletableFuture.allOf(a,b).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		});
//		totalRes = CompletableFuture.allOf(ser1, ser2, ser3, ser4, ser5, ser6, ser7);
		
		log.info("기다리기   *********************");
			log.info(future.toString());
		
		log.info(LocalDateTime.now().toString() + " : End time");
		log.info("gathering E  *********************");
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
