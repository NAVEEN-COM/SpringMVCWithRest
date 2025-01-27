package com.naveen.springwithrest.dto;

public class Order 
{
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param id
	 * @param name
	 */
	public Order(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

}
