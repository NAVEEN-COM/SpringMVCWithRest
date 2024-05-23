package com.naveen.springwithrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecondController {

//	@Autowired
//	private RestTemplate template;
//	@GetMapping("/getalldata")
//	public List<Object> getAllData()
//	{
//		String url="";
//		Object[] objects = template.getForObject(url, Object[], Object[].class);
//		return Arrays.asList(objects);
//	}
}
