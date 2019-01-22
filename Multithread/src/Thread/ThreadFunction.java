package Thread;	
	class AA extends Thread{
		void display()
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("inside A");
			}
		}
		public void run()
		{
			display();
			System.out.println("exit from A");
		}
	}

public class ThreadFunction {
	public static void main(String[] args) {
		AA objA = new AA();
	System.out.println("starting thread A");
	objA.start();
	System.out.println("exit from main thread");
	}

}
