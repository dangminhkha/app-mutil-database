package com.hds.digitalonboarding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hds.digitalonboarding.oracel.service.TestService;
import com.hds.digitalonboarding.postgres.repository.CustomerRepository;
import com.hds.digitalonboarding.util.RestTemplateUtil;

@RestController
@RequestMapping("/api")
public class TestController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/test")
	public ResponseEntity<?> getTest(){
		return ResponseEntity.ok(customerRepository.findAll());
	}
	
	@GetMapping("/test1")
	public ResponseEntity<?> getTest1(){
		List<String> contracts = new ArrayList<>();
		contracts.add("2W023415480");
		contracts.add("2W023415481");
		contracts.add("2W023415482");
		contracts.add("2W023415483");
		return ResponseEntity.ok(testService.findProcedures("2W023515512,ED023515453,2W023515500,2W023515531,2W023515557,2W023515455,2W023515558,2W023515468,2W023515559,2W023515478,2W023515520,2W023515522,2W023515560,2W023515521,2W023515462,2W023515452,2W023515527,2W023515561,2W023515532,2W023515533"));
	}
	
	@GetMapping("/test2")
	public ResponseEntity<?> getTest2(){
		
		HttpEntity<String> httpEntity = createHttpEntity("");
		RestTemplate restTemplate = RestTemplateUtil.getRestTemplate();
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/api/ekyc/test", HttpMethod.POST, httpEntity,
				String.class);
		String body = response.getBody();
		
		return ResponseEntity.ok(body);
	}
	
	public <T> HttpEntity<T> createHttpEntity(T requestBody) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<T> httpEntity = new HttpEntity<>(requestBody, headers);
		return httpEntity;
	}
	
}
