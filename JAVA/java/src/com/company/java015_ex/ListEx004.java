package com.company.java015_ex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fruits {
	private int no;
	private String name;
	private int price;
	public Fruits() { super(); }
	public Fruits(int no, String name, int price) {
		super(); this.no = no; this.name = name; this.price = price; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
public class ListEx004 {
	public static void main(String[] args) {
		List<Fruits> fruits = new ArrayList<>();
		
		fruits.add(new Fruits(1, "apple", 2000));
		fruits.add(new Fruits(2, "banana", 2500));
		fruits.add(new Fruits(3, "coconut", 4500));
		
		for(int i=0;i<fruits.size();i++) {
			Fruits temp = fruits.get(i);
			System.out.println(temp.getName()+" : "+(temp.getNo()*temp.getPrice()));
		}
		for(Fruits temp:fruits) {System.out.println(temp.getName()+" : "+(temp.getNo()*temp.getPrice())); }
		
		String[] fruitinfo = {"사과는 빨갛다",
							  "바나나는 노랗다",
							  "코코넛은 코코하다" };
		Scanner sc = new Scanner(System.in);
		int find = 0;
		int num = 0;
		System.out.println("1-3 과일 정보 입력");
		num=sc.nextInt();
//		v1
		if(num==1) { System.out.println("번호: "+num+"  이름: "+fruits.get(0).getName()+"  가격: "+fruits.get(0).getPrice()+"\n"+fruitinfo[0]); }
		if(num==2) { System.out.println("번호: "+num+"  이름: "+fruits.get(1).getName()+"  가격: "+fruits.get(1).getPrice()+"\n"+fruitinfo[1]); }
		if(num==3) { System.out.println("번호: "+num+"  이름: "+fruits.get(2).getName()+"  가격: "+fruits.get(2).getPrice()+"\n"+fruitinfo[2]); }
//		v2
		for(int i=0;i<fruits.size();i++) {
			if(fruits.get(i).getNo()==num) {find=i; break;}
		}
		System.out.println("번호 : "+ fruits.get(find).getNo());
		System.out.println("이름 : "+ fruits.get(find).getName());
		System.out.println("가격 : "+ fruits.get(find).getPrice());
		System.out.println(fruitinfo[find]);
	}
}