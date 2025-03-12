package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {
	public static void main(String[] args) {
//		데이터 종류 상관없이 같은 방식으로 처리
		Integer[] arr = {1,2,3,4,5,6,7,8,9,0};
		List<Integer> list = Arrays.asList(arr);
		
//		#1. stream
//		Arrays.stream(arr);
		Stream<Integer> stream_arr = Arrays.stream(arr);
		Stream<Integer> stream_list = list.stream();
		
//		#2. 중간연산
//		boolean java.util.function.Predicate.test ( T t )
		stream_arr.filter(t -> t%2!=0) // 필터링 : 홀수
		.distinct()	// 중복제거
		.sorted()	// 정렬
		.skip(1)	// 스킵
//		void java.util.function.Consumer.accept ( T t )
//		.forEach(t->System.out.print(t)); 
		.forEach(System.out::print);	// 각 요소에 대한 작업 수행
		System.out.println();
		stream_list.filter(t -> t%2!=0).distinct().sorted().skip(9).forEach(System.out::print);
//		#3. collect
//		System.out.println(stream_arr.collect(Collectors.toList()) ); < 1회용
		System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
		System.out.println(list.stream().collect(Collectors.toList()));
		
	}
}
