package com.alwold.cditest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alwold on 5/6/15.
 */
@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private ServiceLocal service;

	@RequestMapping(value = "/hello", produces = "text/plain")
	public HttpEntity<String> hello() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> content = new HttpEntity<String>(service.getHello(), headers);
		return content;
	}
}
