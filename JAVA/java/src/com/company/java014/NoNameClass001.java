package com.company.java014;

interface Inter1{ void method(); }
class InterImp1 implements Inter1{
	@Override public void method() {System.out.println("..done");
}}

public class NoNameClass001 {
public static void main(String[] args) {
	Inter1 i1 = new InterImp1(); i1.method();
}
}