package com.ustcjin.domain;

import com.ustcjin.exteneds.Animal;

public class Cat extends Animal {
	static {
		System.out.println("static cat block");
	}
	{
		System.out.println("cat block");
	}
	public Cat(){
		System.out.println("Cat");
	}
	
	public static void say(){
		System.out.println("i am cat");
	}
}
