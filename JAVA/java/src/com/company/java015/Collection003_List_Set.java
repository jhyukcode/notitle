package com.company.java015;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection003_List_Set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(new String("four"));	// 객체
		System.out.println(list.size()+"/"+list);
		
		Set<String> set = new HashSet<>();	// 주머니 : index X , 중복불가
		set.add("one");
		set.add("two");
		set.add("three");
		set.add(new String("four"));	// 객체
		System.out.println(set.size()+"/"+set);
//			add size remove contains
		
		Set<Integer> set2 = new HashSet<>();	// 주머니 : index X , 중복불가
		set2.add(1);
		set2.add(new Integer(2));
		set2.add(3);
		System.out.println(set2.size()+"/"+set2);
		
		int a=1;
		Integer e=1;
		System.out.println(a+"/"+e);
		System.out.println(e.byteValue());
		
		for(Integer e1:set2) {System.out.println(e1);}
		System.out.println("1. add 2. size - "+set2.size());
		System.out.println("3. remove - "+set2.remove(2));
		System.out.println("4. contains - "+set2.contains(1));
		System.out.println(set2);
		
		for(Integer e1:set2) {System.out.println(e1);}
		
		Iterator <Integer> iter = set2.iterator();	// 1. 줄세우기
		while(iter.hasNext()) {	// 2. 처리대상확인
			System.out.println(iter.next());	// 3. 꺼내오기
		}
	}
}
