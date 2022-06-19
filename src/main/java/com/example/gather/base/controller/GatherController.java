package com.example.gather.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatherController {

	private Logger log = LoggerFactory.getLogger(getClass());

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
}
