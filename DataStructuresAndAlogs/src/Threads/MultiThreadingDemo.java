package Threads;

public class MultiThreadingDemo extends Thread{
	int i=0;
	void test1()
	{
		System.out.println("test"+" "+System.nanoTime());
		for(int i=0;i<1000000;i++)
		{
			
		}
		System.out.println(System.nanoTime());
	}
	@Override
	public void run()
	{
		System.out.println(System.nanoTime());
		
		
		for( i=0;i<1000000;i++)
		{
			if(i==0)
			System.out.println(i);
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			//System.out.print(i);
		}
		System.out.println(i);
		System.out.println(System.nanoTime());
	}
	public static void main(String args[]){ 
		{
			MultiThreadingDemo obj=new MultiThreadingDemo();
			MultiThreadingDemo obj2=new MultiThreadingDemo();
			MultiThreadingDemo obj3=new MultiThreadingDemo();
			MultiThreadingDemo obj4=new MultiThreadingDemo();
			obj.test1();
			obj.start();
			obj2.start();
//			obj3.start();
//			obj4.start();
			
			
		}
	}

}
