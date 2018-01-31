package com.neuedu.xianchengsuo;

public class tickets implements Runnable{
	int count = 40;
	Object lock = new Object();
	public synchronized void xiaxie(){
		System.out.println(Thread.currentThread().getName()+"Âô³öµÚ"+count+"ÕÅ");
		count--;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (count>1) {
			xiaxie();
		}
	}
	
}
