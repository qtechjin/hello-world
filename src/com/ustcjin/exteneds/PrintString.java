package com.ustcjin.exteneds;

public class PrintString extends Thread {
	
	private String word;
	private int delay;
	
	public PrintString(String word, int delay){
		this.word = word;
		this.delay = delay;
	}
	
	public void run(){
		try{
			for(;;){
				System.out.println(Thread.currentThread().getName() + ":" + word);
				Thread.sleep(delay);
			}
		} catch (Exception e){
			e.printStackTrace();
			return ;
		}
	}
}
