package com.ustcjin.domain;

import com.ustcjin.exteneds.Animal;

public class Dog extends Animal {
	public static int dogNumber ;
	public String name = "jin";
	static {
		System.out.println("static dog block");
		dogNumber = 0;
	}
	{
		dogNumber ++;
		System.out.println("dog block");
	}
	public Dog(){
		System.out.println("Dog Number:" + dogNumber);
	}
	public void setNum(int num){
		dogNumber = num;
	}
	
	public static void say(){
		System.out.println("i am dog,name:" );
		
	}
	
}
