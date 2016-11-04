package com.ustcjin.test;

import com.ustcjin.domain.Productor;
import com.ustcjin.exteneds.PrintStr;

/**
 * @author I336251
 *
 */
public class MainTest {
	public static void main(String []args){
		Productor pro = new Productor();
		PrintStr pt = new PrintStr("wqe",2);
		ProductProcess pp =  (new MainTest()).new ProductProcess(pro, 1);
		new Thread().start();
	}
	
	class ProductProcess implements Runnable {

		private Productor pro;
		private int banlance;
		public ProductProcess(Productor pro, int banlance) {
			// TODO Auto-generated constructor stub
			this.pro = pro;
			this.banlance = banlance;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			pro.product(banlance);
		}

	}
}
