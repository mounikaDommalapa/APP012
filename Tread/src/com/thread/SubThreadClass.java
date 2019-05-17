package com.thread;

public class SubThreadClass extends Thread
{

	public void run()
	
	{
		int i;
	   final int j=10;
	   for(i=0;i<10;i++)
	   {
		   System.out.println(Thread.currentThread()+" -----------"+i);
	   }
		
	
	
	}
}
