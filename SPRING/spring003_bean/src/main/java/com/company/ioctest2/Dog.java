package com.company.ioctest2;

import org.springframework.stereotype.Component;

@Component

public class Dog implements Animal {
	@Override public String eat() { return "Dog-eat"; }
	@Override public String sleep() { return "Dog-sleep"; }
	@Override public String poo() { return "Dog-poo"; }
}
