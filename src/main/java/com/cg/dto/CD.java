package com.cg.dto;

public class CD {
	int id;
	String name;
	String date;
	int year;
	double price;
	public CD(int id, String name, String date, int year, double price) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.year = year;
		this.price = price;
	}
	public CD() {
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
