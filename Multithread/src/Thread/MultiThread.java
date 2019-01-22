package Thread;
	class A extends Thread
	{
		public void run()
		{
			for(int i=0;i<=5;i=i+2)
			{
				System.out.println("Inside thread A");
			}
			System.out.println("exit from a");
		}
	}

	class B extends Thread
	{
		public void run()
		{
			for(int i=0;i<=5;i=i+2)
			{
				System.out.println("Inside thread B");
			}
			System.out.println("exit from B");
		}
	}


public class MultiThread {

	public static void main(String[] args) {
		A objA=new A();
		B objB=new B();
		System.out.println("starting thread A:");
		objA.start();

		System.out.println("starting thread B:");
		objB.start();
	
	}

}
