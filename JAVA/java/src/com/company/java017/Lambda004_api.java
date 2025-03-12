package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {
	public static void main(String[] args) {
//		#1	Consumer<T> 받는용도 : accept
//		void java.util.function.Consumer.accept 
//		()->{}	파라미터O/리턴값X
//		Consumer<String> consumer = (t)->{System.out.println("hello "+t);};
		Consumer<String> consumer = System.out::println;
		consumer.accept("sally");
		consumer.accept("alpha");
		
//		#2	Supplier - 제공용도 - get
//		1. 메서드 T java.util.function.Supplier.get ()
//		2. ()->{return} 파라미터X/리턴O
		Supplier<String> supplier=()->"Hello";
		System.out.println(supplier.get());
		
//		#3 Predicate - 판단용도 - test
//		1. 메서드 boolean java.util.function.Predicate.test(T t)
//		2. (t)->{return} 파라미터O/리턴O 
		Predicate<Integer> predicate=(t)->{return t<0;};
		System.out.println(predicate.test(-1));
		System.out.println(predicate.test(1));
		
//		#4 Function - 처리용 - apply
//		1. 메서드 R java.util.function.Function.apply ( T t )
//		2. (t)->{return} 파라미터O/리턴O
//		Function<String, Integer> function=(t)->{return Integer.parseInt(t);};
		Function<String, Integer> function= Integer::parseInt;
		System.out.println(function.apply("10")+3);
		
//		#5 Operator - 연산용 - apply
//		1.메서드 int java.util.function.IntBinaryOperator.applyAsInt ( T t )
//		2. (T t)->{return} 파라미터O/리턴O
//		IntBinaryOperator operator=(left,right)->{return left>right?left:right;};
		IntBinaryOperator operator=(a,b)->a>b?a:b;
		System.out.println(operator.applyAsInt(9, 3));
	}
}



/* 
    [1] Consumer : 받는용 > accept
    [2] Supplier : 제공용 > get
    [3] Predicate : 판단용 > test
    [4] Function : 처리용 > apply
    [5] Operator : 연산용 > apply

*/