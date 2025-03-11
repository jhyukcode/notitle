package com.company.java011;
public class Milk {
	
	private int mno, price;
	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	
	private String mname;
	public String getMname() { return mname; }
	public void setMname(String mname) { this.mname = mname; }
	@Override
	public String toString() {
		return "Milk [mno=" + mno + ", price=" + price + ", mname=" + mname + "]";
	}
	
}

