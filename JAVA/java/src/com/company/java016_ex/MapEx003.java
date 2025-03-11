package com.company.java016_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Fruit{
	private int no;
	private String name;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
}

public class MapEx003 {
	public static void main(String[] args) {
		
		Map<Fruit, Integer> map = new HashMap<>();
		
		map.put(new Fruit(1, "Apple")  , 1);
		map.put(new Fruit(1, "Apple")  , 1);
		map.put(new Fruit(2, "Banana") , 2);
	                           
		System.out.println("Total : " + map.size());

	}
}