package com.ustcjin.exteneds;

public class Animal {
	private String name;
	static {
		System.out.println("static animal block");
	}
	{
		System.out.println("animal block");
	}
	public Animal(){
		System.out.println("Animal constructor");
	}
}
