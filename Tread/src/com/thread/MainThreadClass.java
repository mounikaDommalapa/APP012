package com.thread;

public class MainThreadClass {
	
	public static void main(String[] args)
	{
		SubThreadClass s= new SubThreadClass();
		s.start();
		s.setName("mounikadommalapati");
		int i=0;
		
		for(i=0;i<=10;i++)
		{
			System.out.println(Thread.activeCount());
		}
		Runtime r= Runtime.getRuntime();
		r.addShutdownHook(s);
		
	}

}
