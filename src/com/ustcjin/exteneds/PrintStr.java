package com.ustcjin.exteneds;

public class PrintStr implements Runnable {
	private String word;
	private int delay;
	
	public PrintStr(String word, int delay){
		this.word = word;
		this.delay = delay;
	}
	@Override
	public void run() {
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
