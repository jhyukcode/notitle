package com.company.java011;

public class Apple {
	private String name;
	private String order;
	private int num;
	private int price;
	
	@Override
	public String toString() {
		return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
	}
	public void setName(String name) { this.name = name; }
	public void setOrder(String order) { this.order = order; }
	public void setNum(int num) { this.num = num; }
	public void setPrice(int price) { this.price = price; }
}
