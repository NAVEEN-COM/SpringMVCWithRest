package com.naveen.springwithrest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.ArrayList;
import com.naveen.springwithrest.dto.Person;
import com.naveen.springwithrest.dto.Order;
@CrossOrigin("*")
@RestController
public class AppController 
{
	@GetMapping("/message")
	public void message()
	{
		System.out.println("message() executed");
	}
	@GetMapping("/data/{id}")
	public String getUrlData(@PathVariable("id") int id)
	{
		return id+" is the received id";
		
	}
	@GetMapping("/multi/{id}/{name}")
	public String getMultiUrlData1(@PathVariable("id") int id,@PathVariable("name")String name)
	{
		return id+" "+name+" is the received id";
		
	}
	@GetMapping("/paradata")
	public @ResponseBody String getParameterData(@RequestParam("id")int id,@RequestParam("name")String name)
	{
		return id+" "+name;
	}
	
	@PostMapping("/getperson")
	public @ResponseBody String getPerson(@RequestBody Person person)
	{
		return person.toString()+" data accepted";
	}
	@PostMapping("/getorder")
	public @ResponseBody String getOrder(@RequestBody Order order)
	{
		return order.toString()+" data accepted";
	}
	@PostMapping("/getlistoforder")
	public List<Order> allOrders(@RequestBody List<Order> orders)
	{
		//orders.forEach(System.out::println);
		return orders;
	}
	@PutMapping("/update")
	public String updateData()
	{
		return "putMapping";
	}
	@DeleteMapping("/update")
	public String deleteData()
	{
		return "deleteMapping";
	}
	@GetMapping("/getallorders")
	public List<Order> getAllData()
	{
		List<Order> list = new ArrayList();
		list.add(new Order(1,"Biryani"));
		list.add(new Order(2,"Chicken Burger"));
		list.add(new Order(3,"Panner tikka Masala"));
		list.add(new Order(4,"Ice cream"));
		list.add(new Order(5,"panipuri"));
		list.add(new Order(6,"natu kodi masala"));
		list.add(new Order(7,"natu kodi masala"));
		return list;
	}
}
