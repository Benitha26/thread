package com.quinnox.threading;
class MultithreadingDemo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<n;i++)
		{
			MultithreadingDemo obj=new MultithreadingDemo();
			obj.start();
		}
	}

}
