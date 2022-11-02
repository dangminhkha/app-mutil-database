package com.hds.digitalonboarding.util;

import org.springframework.web.client.RestTemplate;

public class RestTemplateUtil {
	
	private static RestTemplate restTemplate;

	public static RestTemplate getRestTemplate() {
		if(restTemplate == null) {
			restTemplate = new RestTemplate();
			restTemplate.setErrorHandler(new HandleErrorRestTemplate());
		}
		return restTemplate;
	}

}
