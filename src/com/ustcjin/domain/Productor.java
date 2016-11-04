package com.ustcjin.domain;

public class Productor {
	private static int num;
	
	public  void product(int banlance){
		num += banlance;
		System.out.println("pruduce a product,num:" + num);
	}
}
